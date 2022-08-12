package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.remote.dto.MeaningDto
import com.enesk.dictionaryapp.domain.model.Meaning

fun MeaningDto.toMeaning(): Meaning {
    return Meaning(
        antonyms = antonyms,
        definitions = definitions,
        partOfSpeech = partOfSpeech,
        synonyms = synonyms
    )
}