package com.enesk.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class WordInfo(
    @SerializedName("license")
    val license: License?,
    @SerializedName("meanings")
    val meanings: List<Meaning>,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("word")
    val word: String?
)
