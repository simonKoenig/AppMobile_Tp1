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
        val message = "Bienvenido $userName"
        welcomeText.text = message
        val editText = findViewById<EditText>(R.id.otro)
        editText.visibility = View.INVISIBLE

        //iría en otra función
        val androidCheck = findViewById<RadioButton>(R.id.android)
        val iosCheck = findViewById<RadioButton>(R.id.ios)
        val androidFoto = findViewById<ImageView>(R.id.androidFoto)
        val iosFoto = findViewById<ImageView>(R.id.iosFoto)

        androidCheck.setOnCheckedChangeListener { buttonView, isChecked ->
            androidFoto.visibility = View.VISIBLE
            iosFoto.visibility = View.GONE
        }

        iosCheck.setOnCheckedChangeListener { buttonView, isChecked ->
            iosFoto.visibility = View.VISIBLE
            androidFoto.visibility = View.GONE
        }
    }

    fun desplegarTexto(view: View) {
        val checkBox = findViewById<CheckBox>(R.id.otroCheck)
        val editText = findViewById<EditText>(R.id.otro)
        if (checkBox.isChecked) {
            editText.visibility = View.VISIBLE
        } else {
            editText.visibility = View.INVISIBLE
        }
    }

    /*fun cambiarFoto(view: View) {
        val androidCheck = findViewById<RadioButton>(R.id.android)
        val iosCheck = findViewById<RadioButton>(R.id.ios)
        val androidFoto = findViewById<ImageView>(R.id.androidFoto)
        val iosFoto = findViewById<ImageView>(R.id.iosFoto)

        androidCheck.setOnCheckedChangeListener { buttonView, isChecked ->
            androidFoto.visibility = View.VISIBLE
            iosFoto.visibility = View.GONE
        }

        iosCheck.setOnCheckedChangeListener { buttonView, isChecked ->
            iosFoto.visibility = View.VISIBLE
            androidFoto.visibility = View.GONE
        }
    }*/
}

