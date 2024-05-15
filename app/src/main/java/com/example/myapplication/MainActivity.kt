package com.example.myapplication

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button)
            .setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }


        val date = Date()
        val cal = Calendar.getInstance()
        val hour = cal[Calendar.HOUR_OF_DAY]

        var greeting: String? = null
        if(hour in 6..11){
            greeting = "Доброе Утро";
        } else if(hour in 12..16){
            greeting = "Добрый день";
        } else if(hour in 17..22){
            greeting = "Добрый вечер";
        } else if(hour in 23..24){
            greeting = "Доброй ночи";
        }else if(hour in 0..6){
            greeting = "Доброй ночи";
        }
        findViewById<TextView>(R.id.textView).text = greeting;
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }


}