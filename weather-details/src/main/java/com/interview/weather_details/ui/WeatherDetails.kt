package com.interview.weather_details.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun WeatherDetails() {
    Column(modifier = Modifier.fillMaxSize()) {
        MainDetails(
            "DUbai", "29", "cloudy",
            "27", "31"
        )
    }
}

@Composable
fun MainDetails(
    city: String,
    temperature: String,
    weather: String,
    minTemp: String,
    maxTemp: String
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = city)
        Text(text = temperature)
        Text(text = weather)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "H= $maxTemp")
            Text(text = "L= $minTemp")
        }
    }
}
