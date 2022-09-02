package com.sagr.weather_app.data.model



import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.squareup.moshi.Json


@Parcelize
data class Sys(
    @Json(name = "country")
    val country: String, // EG
    @Json(name = "sunrise")
    val sunrise: Int, // 1662002999
    @Json(name = "sunset")
    val sunset: Int, // 1662048444
    @Json(name = "type")
    val type: Int // 1
) : Parcelable