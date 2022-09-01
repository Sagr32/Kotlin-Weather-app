package com.sagr.weather_app.data.model



import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.squareup.moshi.Json


@Parcelize
data class Clouds(
    @Json(name = "all")
    val all: Int // 0
) : Parcelable