package com.enesk.dictionaryapp.domain.use_case.get_word_info

import com.enesk.dictionaryapp.domain.model.WordInfo
import com.enesk.dictionaryapp.domain.repository.WordInfoRepository
import com.enesk.dictionaryapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWordInfoUseCase @Inject constructor(
    private val repository: WordInfoRepository
) {
    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow { }
        }
        return repository.getWordInfo(word)
    }
}