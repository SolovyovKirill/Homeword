package com.example.myapplication

import android.app.AlarmManager
import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.myapplication.homework13.SharedPreferencesUtils
import com.example.myapplication.homework13.SharedPrefsKeys.PREFS_KEY
import com.example.myapplication.homework16.MessageDao
import com.example.myapplication.homework16.MessageDb
import com.example.myapplication.homework17.CurrencyRepository
import com.example.myapplication.homework17.CurrencyViewModel
import com.example.myapplication.homework17.restApi.CurrencyService
import org.koin.android.experimental.dsl.viewModel
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApp : Application() {

//    val currencyRepository: CurrencyRepository by lazy {
//        CurrencyRepository(CurrencyService.getCurrencyService())
//    }

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

        startKoin {
            androidContext(this@MyApp)
            modules(viewModels, storageModule, repositoryModule)
        }

        SharedPreferencesUtils.sharedPrefs = applicationContext.getSharedPreferences(
            PREFS_KEY,
            MODE_PRIVATE
        )
    }

    private val viewModels = module {
        viewModel { CurrencyViewModel(get())}
    }

    private val repositoryModule = module {
        factory { CurrencyRepository(get()) }
    }

    private val storageModule = module {
        factory { CurrencyService.getCurrencyService() }
    }

}