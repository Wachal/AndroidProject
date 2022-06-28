package com.example.androidzaliczenie

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivitySinglePlant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_plant)

        val textElementName = findViewById<TextView>(R.id.textViewName)
        val textElementCategory = findViewById<TextView>(R.id.textViewCategory)
        val textElementDescription = findViewById<TextView>(R.id.textViewDescription)
        val shareButton = findViewById<TextView>(R.id.shareButton)
        val deleteButton = findViewById<TextView>(R.id.buttonDelete)


        //pobranie intecji ktora ma w sobie numer obiektu w liscie
        val plantNumber = getIntent().getIntExtra("plantNumber", 0)

        //wyswietlenie stringow
        textElementName.text = "Nazwa: \n"+itemsList[plantNumber].name
        textElementCategory.text = "Kategoria: \n" + itemsList[plantNumber].category
        textElementDescription.text = "Opis: \n" + itemsList[plantNumber].description

        val textToShare = "Nazwa: " + itemsList[plantNumber].name + "\n" + "Kategoria: "+ itemsList[plantNumber].category + "\n" + "Opis: "+ itemsList[plantNumber].description

        //udostępnienie tekstu
        shareButton.setOnClickListener{
            val intent = Intent().apply{
                action = Intent.ACTION_SEND
                type = "text/plain"
            }
            intent.putExtra(Intent.EXTRA_TEXT, textToShare)
            startActivity(intent)
        }

        //Usuwanie obiektu
        deleteButton.setOnClickListener {
            itemsList.removeAt(plantNumber)

            Toast.makeText(applicationContext, "Usunięto roślinę: " + itemsList[plantNumber].name, Toast.LENGTH_LONG).show()
            navigateUpTo(Intent(baseContext, MainActivity::class.java))
        }
    }
}