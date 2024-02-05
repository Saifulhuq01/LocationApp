package com.example.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel : ViewModel() {
    private val _Location = mutableStateOf<LocationData?>(null)
    val location :State<LocationData?> = _Location

    fun updateLocation(newLocation: LocationData){
        _Location.value = newLocation
    }
}