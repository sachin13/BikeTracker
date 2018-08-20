package com.example.biketracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface JourneyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun upsertJourney(journey: Journey)

    @Delete
     fun deleteJourney(journey: Journey)

    @Query("SELECT * FROM journey ORDER BY :orderByCriteria DESC")
    fun getAllJourneys(orderByCriteria: String): LiveData<List<Journey>>


}