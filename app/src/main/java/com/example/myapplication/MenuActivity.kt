package com.example.myapplication

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button7)
            .setOnClickListener {
                val intent = Intent(this, RulesActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.button6)
            .setOnClickListener {
                val intent = Intent(this, ExamplesActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.button5)
            .setOnClickListener {
                val intent = Intent(this, DocumentsActivity::class.java)
                startActivity(intent)
            }
        val mWebView = findViewById<WebView>(R.id.WebView)
        //val customHtml = "<html><body><h1><img src=\"https://discord.com/invite/EYWZtwhsh7\" /></h1>"
                //"</body></html>"
        //mWebView.loadData(customHtml, "text/html", "UTF-8");


        mWebView.loadUrl("https://t.me/VaI1N");
        this.setTitle("WebView");

    }
}