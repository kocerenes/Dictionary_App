package com.enesk.dictionaryapp.data.mapper

import com.enesk.dictionaryapp.data.remote.dto.LicenseDto
import com.enesk.dictionaryapp.domain.model.License

fun LicenseDto.toLicense(): License {
    return License(
        name = name,
        url = url
    )
}