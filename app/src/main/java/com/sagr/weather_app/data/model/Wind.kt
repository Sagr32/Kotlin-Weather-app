package com.sagr.weather_app.data.model



import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.squareup.moshi.Json


@Parcelize
data class Wind(
    @Json(name = "deg")
    val deg: Int, // 360
    @Json(name = "speed")
    val speed: Double // 4.12
) : Parcelable