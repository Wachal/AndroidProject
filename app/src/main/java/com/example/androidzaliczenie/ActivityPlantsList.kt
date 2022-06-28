package com.example.androidzaliczenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginBottom

class ActivityPlantsList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants_list)

        val listShow = findViewById<LinearLayout>(R.id.PlantsList)

        //czyszczenie wyswietlaniej listy przy starcie aktywnosci
        listShow.removeAllViews()

        //jezeli lista nie jest pusta to wyswietl nazwy roslin
        if(!itemsList.isNullOrEmpty()) {
        for(i in itemsList.indices){
                val textVieww = TextView(this)

                //dodanie otwarcia nowej intencji na klik
                textVieww.setOnClickListener {
                    val c = Intent(this, ActivitySinglePlant::class.java)
                    c.putExtra("plantNumber", i)
                    startActivity(c)
                }

            //ustawienie nazwy rosliny jako pojedynczy textview
                textVieww.text = itemsList[i].name.toString()
                textVieww.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)

            //dodanie pojedynczego textview do listy
                listShow.addView(textVieww)
            }
        }else{
            val textView = TextView(this)
            textView.text = "Brak roślin do wyświetlenia"
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            listShow.addView(textView)
        }
    }
}