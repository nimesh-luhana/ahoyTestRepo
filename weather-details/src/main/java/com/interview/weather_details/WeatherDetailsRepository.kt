package com.interview.weather_details

import com.interview.common.data.WeatherDetails
import javax.inject.Inject

class WeatherDetailsRepository @Inject constructor(val restInterface: RestInterface) {

    suspend fun fetchWeatherData(): WeatherDetails {
        return restInterface.getWeatherDetails(
            if (BuildConfig.FLAVOR == "api1") "/data/2.5/weather?q=Dubai&APPID=1aed1d7c4669c87be94ee7fe9eff8879"
            else "/data/2.5/weather?q=Mumbai&APPID=1aed1d7c4669c87be94ee7fe9eff8879"
        )
    }


}