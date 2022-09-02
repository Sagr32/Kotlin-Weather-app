package com.sagr.weather_app.data.repository

import com.sagr.weather_app.data.api.RetrofitBuilder
import com.sagr.weather_app.data.model.WeatherResponse
import com.sagr.weather_app.utils.Constants.API_KEY
import retrofit2.HttpException
import java.io.IOException

class WeatherRepository() {
    lateinit var response: WeatherResponse

    suspend fun getCityWeather(cityName: String) {

            response = RetrofitBuilder.retrofitService.getCityWeatherAsync(
                API_KEY, cityName
            ).await()



    }
}