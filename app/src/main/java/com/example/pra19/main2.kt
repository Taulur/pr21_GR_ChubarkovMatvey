package com.example.pra19

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val currentFr=supportFragmentManager.findFragmentById(R.id.fragment_container)
        if(currentFr==null){
            val fragment=Crimefragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit()
        }
    }

    fun hh(view: View) {
        Snackbar.make(view,"Тыкнул меня, красава",Snackbar.LENGTH_LONG).show()
    }

    fun cl(view: View) {
        var bb: Button
        val currentDate = Date()

        val dateFormat: DateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        val dateText: String = dateFormat.format(currentDate)

      /*  val timeFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val timeText: String = timeFormat.format(currentDate)*/
        bb=findViewById(R.id.crime_date)
        bb.setText(dateText + " вот такой сегодня день");

    }
}