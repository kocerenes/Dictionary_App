package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.local.entity.WordInfoEntity
import com.enesk.dictionaryapp.data.remote.dto.WordInfoDto
import com.enesk.dictionaryapp.domain.model.WordInfo

fun WordInfoDto.toWordInfo(): WordInfo {
    return WordInfo(
        meanings = meanings!!.map { it.toMeaning() },
        phonetic = phonetic,
        word = word
    )
}

fun WordInfoEntity.toWordInfo(): WordInfo{
    return WordInfo(
        meanings = meanings,
        word = word,
        phonetic = phonetic
    )
}

fun WordInfoDto.toWordInfoEntity(): WordInfoEntity{
    return WordInfoEntity(
        meanings = meanings!!.map { it.toMeaning() },
        //license = license!!.toLicense(),
        phonetic = phonetic!!,
        word = word!!
    )
}