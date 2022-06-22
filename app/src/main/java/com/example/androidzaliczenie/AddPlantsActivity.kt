package com.example.androidzaliczenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class AddPlantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_plants)

        val safeButton = findViewById<Button>(R.id.button2)


        safeButton.setOnClickListener{
            val name = findViewById<EditText>(R.id.namePlant)
            val category = findViewById<Spinner>(R.id.spinner).toString()
            val description = findViewById<EditText>(R.id.descriptionPlant)

            var newPlant = Plants(name.text.toString(), category, description.text.toString())
            itemsList.add(newPlant)

//            Log.d("adv", name.text.toString())

            //powiadomienie toast
            Toast.makeText(applicationContext, "Utworzono nową roślinę: " + name.text.toString(), Toast.LENGTH_LONG).show()

            name.setText("")
            description.setText("")
        }
    }
}