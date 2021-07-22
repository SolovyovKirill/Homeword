package com.example.myapplication.homework17

import com.example.myapplication.homework17.restApi.CurrencyApi

class CurrencyRepository(
    private val currencyApi: CurrencyApi
) {
    suspend fun getInfoAboutCurrencyLimit(limit: Int): List<Currency> =
        currencyApi.getCurrencyList(limit).data.map {
            Currency(id = it.id, name = it.name, symbol = it.symbol)
        }
}