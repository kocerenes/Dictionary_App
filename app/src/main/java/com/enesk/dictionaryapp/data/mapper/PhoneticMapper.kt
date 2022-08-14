package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.remote.dto.PhoneticDto
import com.enesk.dictionaryapp.domain.model.Phonetic

fun PhoneticDto.toPhonetic(): Phonetic {
    return Phonetic(
        audio = audio,
        license = license!!.toLicense(),
        sourceUrl = sourceUrl,
        text = text
    )
}