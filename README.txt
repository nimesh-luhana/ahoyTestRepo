This is a simple app displaying weather info of Dubai from openweathermap
-> Its written in kotlin
-> As requested I have attempted to make it a multimodule app. There are four modules,
app: hilt initialisation, MainActivity to display the fragments
weather-details: this module shows the details of weather on a fragment.
   It follows MVVM with repository pattern and also uses coroutines, stateflow, and Hilt/Dagger for Dependency Injection
common: this module contains dependencies which are common to weather details and app module, also it has model classes which could be used also in search and favorite modules if created.
settings: just contains util class for Celcius/Fahrenheit converter and corresponding unit test cases

-> The weather details are displayed using the compose framework.
-> There are two flavors added as well, "api1" and "api2", which act as variants mentioned in the test.
   One shows data of DUbai City and the other one of Mumbai city.