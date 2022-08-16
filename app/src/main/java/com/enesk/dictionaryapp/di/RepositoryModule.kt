package com.enesk.dictionaryapp.di

import com.enesk.dictionaryapp.data.local.WordInfoDatabase
import com.enesk.dictionaryapp.data.remote.DictionaryApi
import com.enesk.dictionaryapp.data.repository.WordInfoRepositoryImpl
import com.enesk.dictionaryapp.domain.repository.WordInfoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideWordInfoRepository(
        api: DictionaryApi,
        dao: WordInfoDatabase
    ): WordInfoRepository {
        return WordInfoRepositoryImpl(api, dao.dao)
    }
}