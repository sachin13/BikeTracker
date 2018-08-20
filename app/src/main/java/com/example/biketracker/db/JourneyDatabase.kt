package com.example.biketracker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Journey::class], version = 1)
@TypeConverters(Converters::class)
abstract class JourneyDatabase: RoomDatabase() {
    abstract fun getJourneyDao(): JourneyDao
}