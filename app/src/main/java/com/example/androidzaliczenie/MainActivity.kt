package com.example.androidzaliczenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.button)
        val itemsList = mutableListOf<Plants>()

        addButton.setOnClickListener{
            val i = Intent(this, AddPlantsActivity::class.java)
            startActivity(i)
        }



    }
}