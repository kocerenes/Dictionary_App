package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.remote.dto.DefinitionDto
import com.enesk.dictionaryapp.domain.model.Definition

fun DefinitionDto.toDefinition(): Definition {
    return Definition(
        antonyms = antonyms,
        definition = definition,
        example = example,
        synonyms = synonyms
    )
}