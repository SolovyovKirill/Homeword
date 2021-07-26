package com.example.myapplication.homework19

import android.app.*
import android.content.Intent
import android.os.IBinder
import android.widget.Toast


class AlarmService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Toast.makeText(applicationContext, MY_ALARM_MANAGER, Toast.LENGTH_LONG).show()
        return START_NOT_STICKY
    }

    companion object {
        const val MY_ALARM_MANAGER = "My Alarm Manager"
    }

}