package com.enesk.dictionaryapp.domain.model

import com.google.gson.annotations.SerializedName

data class Phonetic(
    @SerializedName("audio")
    val audio: String?,
    @SerializedName("sourceUrl")
    val sourceUrl: String?,
    @SerializedName("text")
    val text: String?
)
