package com.example.androidzaliczenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddPlantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_plants)

        val safeButton = findViewById<Button>(R.id.button2)

        safeButton.setOnClickListener{
            val name = findViewById<Button>(R.id.button2)
        }
    }
}