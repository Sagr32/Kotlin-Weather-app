package com.sagr.weather_app.ui.view

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sagr.weather_app.R
import com.sagr.weather_app.databinding.ActivityMainBinding
import com.sagr.weather_app.ui.viewmodel.MainViewModel
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel.weatherResponse.observe(this, Observer {
            it.let {
                binding.weather = it
                binding.weatherPredicationTxt.visibility = GONE
                binding.weatherPlaceholderImage.visibility = GONE
                binding.temperatureText.visibility = VISIBLE
                binding.cityNameText.visibility = VISIBLE
                binding.weatherIcon.visibility = VISIBLE
                binding.dayLabel.visibility = VISIBLE
                binding.dateLabel.visibility = VISIBLE
                binding.weatherIllustration.visibility = VISIBLE
            }
        })



        binding.searchEditText.setOnEditorActionListener { city, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                getCityWeather(city.text.toString())
            }

            return@setOnEditorActionListener false
        }

    }

    private fun getCityWeather(cityName: String) {
        viewModel.getCityWeather(cityName)
    }


}