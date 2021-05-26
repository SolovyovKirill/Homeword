package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.homework3.Animal
import com.example.myapplication.homework3.Cat
import com.example.myapplication.homework3.Leopard
import com.example.myapplication.homework4.Chief
import com.example.myapplication.homework4.Employee
import com.example.myapplication.homework4.Manager
import com.example.myapplication.homework4.Worker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ДОМАШКА ЕЩЕ НЕ СДЕЛАНА, ЗАСТРЯЛ ВЫЗОВА МЕТОДА У РАБОТНИКА КОГДА ПО КОЛЛЕКЦИИ БЕЖАТЬ НУЖНО
        //ЕСЛИ ЕСТЬ ЗАМЕЧАНИЯ ПО ЭТОМУ МОМЕНТУ, ТО ОТПИШИТЕ. ЗАПУШИЛ ДЛЯ СЕБЯ

        val workerArtem: Worker = Worker("Artem", 300)
        val workerKirill: Worker = Worker("Kirill", 400)
        val workerVasya:Worker = Worker("Vasya", 500)
        val workerNikita: Worker = Worker("Nikita", 600)
        val workerMasha: Worker = Worker("Masha", 600)
        val workerVanya: Worker = Worker("Vanya", 600)

        val listWorker1: List<Worker> = listOf<Worker>(workerArtem, workerKirill, workerVasya)
        val listWorker2: List<Worker> = listOf<Worker>(workerNikita, workerMasha, workerVanya)

        val managerAlex: Manager = Manager("Alex", 2000, listWorker1)
        val managerVasya: Manager = Manager("Vasya", 2300, listWorker1)
        val managerAnton: Manager = Manager("Anton", 2500, listWorker2)
        val managerStas: Manager = Manager("Stas", 2200, listWorker2)

        val listManager1: List<Manager> = listOf<Manager>(managerAlex, managerVasya)
        val listManager2: List<Manager> = listOf<Manager>(managerAnton, managerStas)

        val chiefAndrey: Chief = Chief("Andrey", 5000, listManager1)
        val chiefMax: Chief = Chief("Max", 8000, listManager2)

        val listEmployee = listOf(
            chiefAndrey,
            chiefMax,
            managerAlex,
            managerAnton,
            managerStas,
            managerVasya,
            workerArtem,
            workerKirill,
            workerMasha,
            workerNikita,
            workerVanya,
            workerVasya
        )

        listEmployee.forEach{
            println("Имя сотрудника " + it.name)
            println("Зарплата сотрудника " + it. name + " составляет "+ it.wages)
        }
    }
}