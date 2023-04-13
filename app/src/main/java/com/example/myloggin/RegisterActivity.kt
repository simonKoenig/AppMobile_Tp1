package com.example.myloggin

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
            popupNotify("Advertencia","Debe completar sus datos para el registro",this)
            return
        }
        if (userPasswd.length<6){
            popupNotify("Advertencia","La contraseña es demasiado corta",this)
            return
        }
        if (userPasswd != userConfirm){
            popupNotify("Advertencia","Las contraseñas no coinciden",this)
            return
        }
        data[userName] = userPasswd
        val loginActivity = Intent(this, MainActivity::class.java)
        startActivity(loginActivity)
    }
}