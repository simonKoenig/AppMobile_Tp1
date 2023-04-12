package com.example.myloggin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_layout)
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val userName = intent.getStringExtra("userName")
        val message = "Bienvenido $userName"
        welcomeText.text = message
    }
}