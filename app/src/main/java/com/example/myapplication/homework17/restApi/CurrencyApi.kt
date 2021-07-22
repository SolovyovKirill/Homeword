package com.example.myapplication.homework17.restApi

import com.example.myapplication.BuildConfig.API_KEY
import com.example.myapplication.homework17.response.CurrencyResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface CurrencyApi {

    @Headers("${API_KEY}")
    @GET("v1/fiat/map")
    suspend fun getCurrencyList(@Query("limit") limit: Int): CurrencyResponse

}