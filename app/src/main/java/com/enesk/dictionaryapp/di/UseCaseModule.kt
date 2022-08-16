package com.enesk.dictionaryapp.di

import com.enesk.dictionaryapp.domain.repository.WordInfoRepository
import com.enesk.dictionaryapp.domain.use_case.get_word_info.GetWordInfoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideWordInfoUseCase(
        repository: WordInfoRepository
    ): GetWordInfoUseCase {
        return GetWordInfoUseCase(repository)
    }
}