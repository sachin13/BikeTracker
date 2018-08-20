package com.example.biketracker.repositories

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.biketracker.db.Journey
import com.example.biketracker.db.JourneyDao

import javax.inject.Inject

class BikeRushRepository @Inject constructor(val journeyDao: JourneyDao) {

    suspend fun upsertJourney(journey: Journey) = journeyDao.upsertJourney(journey)

    suspend fun deleteJourney(journey: Journey) = journeyDao.deleteJourney(journey)

    fun getAllJourneys(orderByCriteria: String) = journeyDao.getAllJourneys(orderByCriteria)



}