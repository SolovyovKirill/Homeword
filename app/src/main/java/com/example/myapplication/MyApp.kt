package com.example.myapplication

import android.app.Application
import android.security.identity.MessageDecryptionException
import androidx.room.Room
import com.example.myapplication.homework13.SharedPreferencesUtils
import com.example.myapplication.homework13.SharedPrefsKeys.PREFS_KEY
import com.example.myapplication.homework16.MessageDao
import com.example.myapplication.homework16.MessageDb

class MyApp : Application() {

    private val messageDb: MessageDb by lazy {
        Room.databaseBuilder(
            applicationContext,
            MessageDb::class.java,
            "message_database"
        ).build()
    }

    val messageDao: MessageDao by lazy { messageDb.messageDao() }

    override fun onCreate() {
        super.onCreate()

        SharedPreferencesUtils.sharedPrefs = applicationContext.getSharedPreferences(
            PREFS_KEY,
            MODE_PRIVATE
        )
    }

}