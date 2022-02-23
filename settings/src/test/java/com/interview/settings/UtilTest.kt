package com.interview.settings


import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class UtilTest {


    @Test
    fun isFahrenheitCorrectlyCalculated() {
        val celcius = "100"
        val fahrenheit = Util.celsiusToFahrenheit(celcius)
        assertThat(fahrenheit).isEqualTo(212.toDouble())
    }

    @Test
    fun isFahrenheitCorrectlyCalculatedNotEqualScenario() {
        val celcius = "110"
        val fahrenheit = Util.celsiusToFahrenheit(celcius)
        assertThat(fahrenheit).isNotEqualTo(212.toDouble())
    }
}