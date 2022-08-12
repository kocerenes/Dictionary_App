package com.enesk.dictionaryapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WordInfoDto(
    @SerializedName("license")
    val license: LicenseDto?,
    @SerializedName("meanings")
    val meanings: List<MeaningDto>?,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("phonetics")
    val phonetics: List<PhoneticDto>?,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>?,
    @SerializedName("word")
    val word: String?
)