package com.interview.weather_details.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.interview.weather_details.WeatherDetailsFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class WeatherDetailsFragment : Fragment() {
    private val viewModel: WeatherDetailsFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                WeatherDetails()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launchWhenResumed {
            viewModel.weatherDetailsSF.collect {
                when (it) {
                    is WeatherDetailsFragmentViewModel.WeatherQueryStates.Empty -> {
                    }
                    is WeatherDetailsFragmentViewModel.WeatherQueryStates.Success -> {
                    }
                    is WeatherDetailsFragmentViewModel.WeatherQueryStates.Loading -> {
                    }
                    is WeatherDetailsFragmentViewModel.WeatherQueryStates.Failure -> {
                    }
                }

            }
        }
        viewModel.getWeatherDetails()
    }
}