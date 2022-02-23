package com.interview.ahoy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.interview.weather_details.ui.WeatherDetailsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.interview.ahoy.R.layout.activity_main)
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(com.interview.ahoy.R.id.container, WeatherDetailsFragment())
        ft.commit()
    }

}