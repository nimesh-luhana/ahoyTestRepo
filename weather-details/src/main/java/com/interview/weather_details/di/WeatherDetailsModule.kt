package com.interview.weather_details.di

import com.interview.weather_details.NetworkManager
import com.interview.weather_details.WeatherDetailsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
object WeatherDetailsModule {

    @Provides
    @Singleton
    fun provideWeatherDetailsRepository(weatherDetailsRepository: WeatherDetailsRepository): WeatherDetailsRepository {
        return WeatherDetailsRepository(NetworkManager.getWeatherRestInterface())
    }
}