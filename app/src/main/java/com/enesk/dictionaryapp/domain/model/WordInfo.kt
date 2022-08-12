package com.enesk.dictionaryapp.domain.model

import com.enesk.dictionaryapp.data.remote.dto.LicenseDto
import com.enesk.dictionaryapp.data.remote.dto.MeaningDto
import com.enesk.dictionaryapp.data.remote.dto.PhoneticDto
import com.google.gson.annotations.SerializedName

data class WordInfo(
    @SerializedName("license")
    val license: LicenseDto?,
    @SerializedName("meanings")
    val meanings: List<MeaningDto>?,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>?,
    @SerializedName("word")
    val word: String?
)
