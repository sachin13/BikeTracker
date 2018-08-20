package com.example.biketracker.di

import android.content.Context
import androidx.room.Room
import com.example.biketracker.db.JourneyDatabase
import com.example.biketracker.other.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideJourneyDatabaseInstance(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, JourneyDatabase::class.java,DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideJourneyDao(db: JourneyDatabase) = db.getJourneyDao()
}