package com.sagr.weather_app.data.model



import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.squareup.moshi.Json


@Parcelize
data class Main(
    @Json(name = "feels_like")
    val feelsLike: Double, // 30.38
    @Json(name = "humidity")
    val humidity: Int, // 30
    @Json(name = "pressure")
    val pressure: Int, // 1006
    @Json(name = "temp")
    val temp: Double, // 31.61
    @Json(name = "temp_max")
    val tempMax: Double, // 31.61
    @Json(name = "temp_min")
    val tempMin: Double // 31.61
) : Parcelable