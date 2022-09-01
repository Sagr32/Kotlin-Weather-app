package com.sagr.weather_app.data.api

import com.sagr.weather_app.data.model.WeatherResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

// TODO: STEP(4): build the retrofit interface with required functions
interface ApiInterface {

    @GET("data/2.5/weather")
    fun getTopRatedMoviesAsync(
        @Query("appid") apiKey: String,
        @Query("q") cityName: String
    ): Deferred<WeatherResponse>
}