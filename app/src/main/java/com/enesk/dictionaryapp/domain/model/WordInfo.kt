package com.enesk.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class WordInfo(
    @SerializedName("meanings")
    val meanings: List<Meaning>,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("word")
    val word: String?
)
