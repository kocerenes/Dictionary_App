package com.enesk.dictionaryapp.data.repository

import com.enesk.dictionaryapp.data.local.WordInfoDao
import com.enesk.dictionaryapp.data.mapper.toWordInfo
import com.enesk.dictionaryapp.data.mapper.toWordInfoEntity
import com.enesk.dictionaryapp.data.remote.DictionaryApi
import com.enesk.dictionaryapp.domain.model.WordInfo
import com.enesk.dictionaryapp.domain.repository.WordInfoRepository
import com.enesk.dictionaryapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class WordInfoRepositoryImpl @Inject constructor(
    private val api: DictionaryApi,
    private val dao: WordInfoDao
) : WordInfoRepository {

    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow{

        emit(Resource.Loading())
        val wordInfos = dao.getWordInfos(word).map { it.toWordInfo() }
        emit(Resource.Loading(data = wordInfos))

        try {
            val remoteWordInfos = api.getWordInfo(word)
            dao.deleteWordInfos(remoteWordInfos.map { it.word!! })
            dao.insertWordInfos(remoteWordInfos.map { it.toWordInfoEntity() })
        }catch (e: HttpException){
            emit(Resource.Error(e.message()))
        }catch (e: IOException){
            emit(Resource.Error(e.localizedMessage))
        }

        val newWordInfos = dao.getWordInfos(word).map { it.toWordInfo() }
        emit(Resource.Success(newWordInfos))
    }
}