package com.enesk.dictionaryapp.domain.repository

import com.enesk.dictionaryapp.domain.model.WordInfo
import com.enesk.dictionaryapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}