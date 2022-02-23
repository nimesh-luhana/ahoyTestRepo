package com.interview.weather_details

import com.interview.common.data.WeatherDetails
import retrofit2.http.GET
import retrofit2.http.Url

interface RestInterface {

    @GET()
    suspend fun getWeatherDetails(@Url url:String): WeatherDetails
}