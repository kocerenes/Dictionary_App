package com.enesk.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class Definition(
    @SerializedName("antonyms")
    val antonyms: List<String?>?,
    @SerializedName("definition")
    val definition: String?,
    @SerializedName("example")
    val example: String?,
    @SerializedName("synonyms")
    val synonyms: List<String?>?
)