package com.enesk.dictionaryapp.di

import android.app.Application
import androidx.room.Room
import com.enesk.dictionaryapp.data.local.WordInfoDatabase
import com.enesk.dictionaryapp.data.util.GsonParser
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideWordInfoDatabase(
        app: Application,
        gson: Gson
    ): WordInfoDatabase {
        return Room.databaseBuilder(
            app,
            WordInfoDatabase::class.java,
            "word_db"
        ).addTypeConverter(
            GsonParser(gson)
        ).build()
    }
}