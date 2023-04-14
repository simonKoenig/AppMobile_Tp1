package com.example.myloggin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_layout)
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val userName = intent.getStringExtra("userName")
        val message = "Bienvenido a la aplicacion $userName"
        welcomeText.text = message

    }

    fun desplegarTexto(view: View) {
        val checkBox = findViewById<CheckBox>(R.id.otroCheck)
        val editText = findViewById<EditText>(R.id.editOtro)
        if (checkBox.isChecked) {
            editText.visibility = View.VISIBLE
        } else {
            editText.visibility = View.INVISIBLE
        }
    }

    fun androidFoto(view: View){
        val imagen = findViewById<ImageView>(R.id.osFoto)
        imagen.setImageResource(R.drawable.android)
    }

    fun iosFoto(view: View){
        val imagen = findViewById<ImageView>(R.id.osFoto)
        imagen.setImageResource(R.drawable.ios)
    }
}

