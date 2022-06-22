package com.example.androidzaliczenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pobranie butona
        val addButton = findViewById<Button>(R.id.button)
        val showListButton = findViewById<Button>(R.id.button3)

        //obsluga guzika dodaj - otwiera formularz
        addButton.setOnClickListener{
            val i = Intent(this, AddPlantsActivity::class.java)
            startActivity(i)
        }

        showListButton.setOnClickListener{
            val b = Intent(this, ActivityPlantsList::class.java)
            startActivity(b)
        }

    }
}