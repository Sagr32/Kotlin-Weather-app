package com.sagr.weather_app.data.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sagr.weather_app.utils.Constants.TABLE_NAME
import com.squareup.moshi.Json

@Parcelize
data class WeatherResponse(
    @Json(name = "id")
    val id: Int,
    @Json(name = "base")
    val base: String,
    @Json(name = "clouds")
    val clouds: Clouds,
    @Json(name = "cod")
    val cod: Int,
    @Json(name = "dt")
    val dt: Int,
    @Json(name = "main")
    val main: Main,
    @Json(name = "name")
    val name: String,
    @Json(name = "sys")
    val sys: Sys,
    @Json(name = "timezone")
    val timezone: Int,
    @Json(name = "visibility")
    val visibility: Int,
    @Json(name = "weather")
    val weather: List<Weather>,
    @Json(name = "wind")
    val wind: Wind
) : Parcelable