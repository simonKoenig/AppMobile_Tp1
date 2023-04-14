package com.example.myloggin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.AlertDialog
import android.view.View
import android.widget.CheckBox
import android.widget.EditText


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_layout)
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val userName = intent.getStringExtra("userName")
        val message = "Bienvenido $userName"
        welcomeText.text = message
    }

    fun showDialogFunction(view: View) {
        val checkBox = findViewById<CheckBox>(R.id.otroCheck)
        val editText = findViewById<EditText>(R.id.otro)
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                editText.visibility = View.VISIBLE
            } else {
                editText.visibility = View.INVISIBLE
            }
        }
    }

}