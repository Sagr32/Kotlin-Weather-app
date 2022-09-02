package com.sagr.weather_app.utils

import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.sagr.weather_app.R
import com.sagr.weather_app.data.model.WeatherResponse

@BindingAdapter("tempInCelsius")
fun bindTextViewToCelsius(textView: TextView, temperature: Double) {
    temperature.let {
        val context = textView.context
        textView.text = String.format(context.getString(R.string.temperature_format), temperature)
    }
}

@BindingAdapter("cityDetailedName")
fun bindTextViewToDetailedName(textView: TextView, weather: WeatherResponse?) {
    weather?.let {
        val context = textView.context
        textView.text = String.format(
            context.getString(R.string.city_detailed_format),
            weather.name,
            weather.sys.country
        )

    }
}





