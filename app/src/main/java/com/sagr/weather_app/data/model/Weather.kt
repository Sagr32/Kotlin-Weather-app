package com.sagr.weather_app.data.model



import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.squareup.moshi.Json


@Parcelize
data class Weather(
    @Json(name = "description")
    val description: String, // clear sky
    @Json(name = "icon")
    val icon: String, // 01n
    @Json(name = "id")
    val id: Int, // 800
    @Json(name = "main")
    val main: String // Clear
) : Parcelable