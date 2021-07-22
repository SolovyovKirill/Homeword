package com.example.myapplication.homework17.restApi

import com.example.myapplication.BuildConfig.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CurrencyService {

    private fun getRetrofitObject() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient().newBuilder().addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
        )
        .build()

    fun getCurrencyService(): CurrencyApi = getRetrofitObject().create(CurrencyApi::class.java)
}