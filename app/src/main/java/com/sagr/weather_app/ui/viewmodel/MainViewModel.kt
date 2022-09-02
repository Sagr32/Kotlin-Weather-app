package com.sagr.weather_app.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sagr.weather_app.data.model.WeatherResponse
import com.sagr.weather_app.data.repository.WeatherRepository
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException


class MainViewModel : ViewModel() {
    private val repository: WeatherRepository = WeatherRepository()

    private val _weatherResponse = MutableLiveData<WeatherResponse>()

    val weatherResponse: LiveData<WeatherResponse>
        get() = _weatherResponse



    fun getCityWeather(cityName: String) {
        viewModelScope.launch {
            try {
                repository.getCityWeather(cityName)
                repository.response.let {
                    _weatherResponse.value = repository.response

                }

            } catch (e: HttpException) {
                Timber.d(e.message())
            } catch (e: IOException) {
                Timber.d(e.message)
            }
        }


    }
}