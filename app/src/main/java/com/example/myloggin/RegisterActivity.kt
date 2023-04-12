package com.example.myloggin

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)
    }

    fun registrarse (view: View){
        val userName = findViewById<EditText>(R.id.userName).text.toString()
        val userEmail = findViewById<EditText>(R.id.userEmail).text.toString()
        val userPasswd = findViewById<EditText>(R.id.userPasswd).text.toString()
        val userConfirm = findViewById<EditText>(R.id.userConfirm).text.toString()
        if (userPasswd.isEmpty()||userPasswd.isEmpty()||userEmail.isEmpty()){
            val message = AlertDialog.Builder(this)
            message.setTitle("Advertencia")
            message.setMessage("Debe completar sus datos para el registro")
            val popup = message.create()
            popup.show()
            return
        }
        if (userPasswd.length<6){
            val message = AlertDialog.Builder(this)
            message.setTitle("Advertencia")
            message.setMessage("La contraseña es demasiado corta")
            val popup = message.create()
            popup.show()
            return
        }
        if (userPasswd != userConfirm){
            val message = AlertDialog.Builder(this)
            message.setTitle("Advertencia")
            message.setMessage("Las contraseñas no coinciden")
            val popup = message.create()
            popup.show()
            return
        }
        data[userName] = userPasswd
        val loginActivity = Intent(this, MainActivity::class.java)
        startActivity(loginActivity)
    }
}