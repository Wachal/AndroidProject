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
        val listShow = findViewById<LinearLayout>(R.id.textView4)
        val refreshButton = findViewById<Button>(R.id.button3)

        //obsluga guzika dodaj - otwiera formularz
        addButton.setOnClickListener{
            val i = Intent(this, AddPlantsActivity::class.java)
            startActivity(i)
        }

        //renderowanko listy nazw roslin z itemList
        fun renderList(){
            for(i in itemsList.indices){
                val textVieww = TextView(this)
                textVieww.text = itemsList[i].name.toString()
                textVieww.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
                listShow.addView(textVieww)
            }
        }

        //wyswietlanie listy na guzik bo trzeba ją jakos odswiezyc po ddaniu nowego elementu xd
        refreshButton.setOnClickListener{
            renderList()
        }

    }
}