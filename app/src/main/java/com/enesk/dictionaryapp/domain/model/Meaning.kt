package com.enesk.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class Meaning(
    @SerializedName("antonyms")
    val antonyms: List<String?>?,
    @SerializedName("definitions")
    val definitions: List<Definition?>?,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String?,
    @SerializedName("synonyms")
    val synonyms: List<String?>?
)
