package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.remote.dto.WordInfoDto
import com.enesk.dictionaryapp.domain.model.WordInfo

fun WordInfoDto.toWordInfo(): WordInfo {
    return WordInfo(
        license = license,
        meanings = meanings,
        phonetic = phonetic,
        sourceUrls = sourceUrls,
        word = word
    )
}