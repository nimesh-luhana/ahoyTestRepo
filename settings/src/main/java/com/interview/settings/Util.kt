package com.interview.settings

object Util {

    fun fahrenheitToCelsius(fahrenheit: String): Double {
        val fahrenheit: Double = fahrenheit.toDouble()
        return 5 * (fahrenheit - 32.0) / 9.0

    }

    fun celsiusToFahrenheit(fahrenheit: String): Double {
        val celsius: Double = fahrenheit.toDouble()
        return ((9 * celsius) / 5) + 32;

    }
}