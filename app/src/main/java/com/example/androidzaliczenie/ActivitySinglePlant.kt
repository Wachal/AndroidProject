package com.example.androidzaliczenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class ActivitySinglePlant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_plant)

        val textElementName = findViewById<TextView>(R.id.textViewName)
        val textElementCategory = findViewById<TextView>(R.id.textViewCategory)
        val textElementDescription = findViewById<TextView>(R.id.textViewDescription)

        //pobranie intecji ktora ma w sobie numer obiektu w liscie
        val plantNumber = getIntent().getIntExtra("plantNumber", 0)

        //wyswietlenie stringow
        textElementName.text = "Nazwa: \n"+itemsList[plantNumber].name
        textElementCategory.text = "Kategoria: \n" + itemsList[plantNumber].category
        textElementDescription.text = "Opis: \n" + itemsList[plantNumber].description
    }
}