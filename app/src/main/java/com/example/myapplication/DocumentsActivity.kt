package com.example.myapplication

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DocumentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_documents)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button2)
            .setOnClickListener {
                val intent = Intent(this, StatementActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.button8)
            .setOnClickListener {
                val intent = Intent(this, CertificateActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.button4)
            .setOnClickListener {
                val intent = Intent(this, BlankActivity::class.java)
                startActivity(intent)
            }
    }
}