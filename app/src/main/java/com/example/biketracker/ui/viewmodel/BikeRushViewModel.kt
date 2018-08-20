package com.example.biketracker.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.biketracker.db.Journey
import com.example.biketracker.repositories.BikeRushRepository

import kotlinx.coroutines.launch

class BikeRushViewModel @ViewModelInject constructor(val bikeRushRepository: BikeRushRepository): ViewModel() {

    fun insertJourney(journey: Journey) = viewModelScope.launch {
        bikeRushRepository.upsertJourney(journey)
    }

    fun deleteJourney(journey: Journey) = viewModelScope.launch {
        bikeRushRepository.deleteJourney(journey)
    }

    val journeyList = bikeRushRepository.getAllJourneys("dateCreated")

}