package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.homework6.Homework6Activity

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text1)
        textView.setOnClickListener {
            startActivity(Intent(this, Homework6Activity::class.java))
        }

//        val workerArtem: Worker = Worker("Artem", 300)
//        val workerKirill: Worker = Worker("Kirill", 400)
//        val workerVasya: Worker = Worker("Vasya", 500)
//        val workerNikita: Worker = Worker("Nikita", 600)
//        val workerMasha: Worker = Worker("Masha", 600)
//        val workerVanya: Worker = Worker("Vanya", 600)
//
//        val listWorker1: List<Worker> = listOf<Worker>(workerArtem, workerKirill, workerVasya)
//        val listWorker2: List<Worker> = listOf<Worker>(workerNikita, workerMasha, workerVanya)
//
//        val managerAlex: Manager = Manager("Alex", 2000, listWorker1)
//        val managerVasya: Manager = Manager("Vasya", 2300, listWorker1)
//        val managerAnton: Manager = Manager("Anton", 2500, listWorker2)
//        val managerStas: Manager = Manager("Stas", 2200, listWorker2)
//
//        val listManager1: List<Manager> = listOf<Manager>(managerAlex, managerVasya)
//        val listManager2: List<Manager> = listOf<Manager>(managerAnton, managerStas)
//
//        val chiefAndrey: Chief = Chief("Andrey", 5000, listManager1)
//        val chiefMax: Chief = Chief("Max", 8000, listManager2)
//
//        val listChief: List<Chief> = listOf(chiefAndrey, chiefMax)
//
//        val listEmployee = mutableListOf<Employee>()
//        listEmployee.addAll(listWorker1)
//        listEmployee.addAll(listWorker2)
//        listEmployee.addAll(listManager1)
//        listEmployee.addAll(listManager2)
//        listEmployee.addAll(listChief)
//
//        listEmployee.forEach {
//            println(
//                "Имя сотрудника ${it.name} зарабатывает ${it.wages}. "
//            )
//            (it as? Worker)?.work()
//        }

    }
}