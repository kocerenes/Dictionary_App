package com.enesk.dictionaryapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String?,
    @SerializedName("sourceUrl")
    val sourceUrl: String?,
    @SerializedName("text")
    val text: String?
)