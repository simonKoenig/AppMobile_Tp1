package com.example.myloggin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.AlertDialog
import android.view.View
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
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Ingrese su texto")

        val input = EditText(this)
        builder.setView(input)

        builder.setPositiveButton("Aceptar") { _, _ ->
            val text = input.text.toString()
        }
        builder.setNegativeButton("Cancelar") { dialog, _ ->
            dialog.cancel()
        }

        val dialog = builder.create()
        dialog.show()
    }

}