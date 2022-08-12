package com.enesk.dictionaryapp.domain.model

import com.enesk.dictionaryapp.data.remote.dto.LicenseDto
import com.google.gson.annotations.SerializedName

data class Phonetic(
    @SerializedName("audio")
    val audio: String?,
    @SerializedName("license")
    val license: LicenseDto?,
    @SerializedName("sourceUrl")
    val sourceUrl: String?,
    @SerializedName("text")
    val text: String?
)
