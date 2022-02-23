package com.interview.weather_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.interview.common.data.WeatherDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherDetailsFragmentViewModel @Inject constructor(
    private val repository: WeatherDetailsRepository
) : ViewModel() {
    fun WeatherDetailsFragmentViewModel() {}
    private var _weatherDetailsMSF = MutableStateFlow<WeatherQueryStates>(WeatherQueryStates.Empty)
    var weatherDetailsSF: StateFlow<WeatherQueryStates> = _weatherDetailsMSF

    fun getWeatherDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            _weatherDetailsMSF.value = WeatherQueryStates.Loading
            try {
                val response = repository.fetchWeatherData()
                _weatherDetailsMSF.value = WeatherQueryStates.Success(response)
            } catch (e: Exception) {
                _weatherDetailsMSF.value = WeatherQueryStates.Failure("Sorry, Some error occured!")
            }

        }

    }

    sealed class WeatherQueryStates {
        object Empty : WeatherQueryStates()
        object Loading : WeatherQueryStates()
        data class Success(val weatherDetails: WeatherDetails) : WeatherQueryStates()
        data class Failure(val error: String) : WeatherQueryStates()
    }

}