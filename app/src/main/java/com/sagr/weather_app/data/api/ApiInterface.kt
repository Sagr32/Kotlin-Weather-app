package com.sagr.weather_app.data.api

import com.sagr.weather_app.data.model.WeatherResponse
import com.sagr.weather_app.utils.Constants.TEMP_UNIT
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

// TODO: STEP(4): build the retrofit interface with required functions
interface ApiInterface {

    @GET("data/2.5/weather")
    fun getCityWeatherAsync(
        @Query("appid") apiKey: String,
        @Query("q") cityName: String,
        // For temperature in Fahrenheit use units=imperial
        // For temperature in Celsius use units=metric
        // Temperature in Kelvin is used by default, no need to use units parameter in API cal
        @Query("units") tempUnit: String =TEMP_UNIT
    ): Deferred<WeatherResponse>
}