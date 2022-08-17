package com.enesk.dictionaryapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.enesk.dictionaryapp.domain.model.Meaning

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
)
