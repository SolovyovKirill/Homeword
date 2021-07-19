package com.example.myapplication.homework16

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MessageEntity::class], version = 1)
abstract class MessageDb : RoomDatabase() {
    abstract fun messageDao(): MessageDao
}