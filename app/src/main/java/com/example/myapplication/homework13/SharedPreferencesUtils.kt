package com.example.myapplication.homework13

import android.content.SharedPreferences

object SharedPreferencesUtils {

    lateinit var sharedPrefs: SharedPreferences

    fun putInt(key: String, value: Int) {
        sharedPrefs.edit().putInt(key, value).apply()
    }

    fun putString(key: String, value: String) {
        sharedPrefs.edit().putString(key, value).apply()
    }

    fun getString(key: String) = sharedPrefs.getString(key, SharedPrefsKeys.DEF_VALUE_BRAND)

    fun getInt(key: String): Int = sharedPrefs.getInt(key,SharedPrefsKeys.DEF_VALUE_BARCODE)
}