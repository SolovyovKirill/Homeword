package com.example.myapplication.homework3

abstract class Animal(var speedAnimals: Double, open var nameOfAnimal: String) {

    fun timeDistance (): Double {
        return DISTANCE / (speedAnimals * 3600)
    }

    companion object {
        private const val DISTANCE = 1080
    }
}