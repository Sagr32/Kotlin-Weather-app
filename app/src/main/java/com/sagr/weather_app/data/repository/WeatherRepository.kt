package com.sagr.weather_app.data.repository

import com.sagr.weather_app.data.api.RetrofitBuilder
import com.sagr.weather_app.utils.Constants.API_KEY

class WeatherRepository() {

    suspend fun getCityWeather(cityName: String) {
        var response = RetrofitBuilder.retrofitService.getCityWeather(
            API_KEY, cityName
        ).await()
    }
}