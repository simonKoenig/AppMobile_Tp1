package com.example.myloggin

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

val data = mapOf("Juan Torres" to "1234utn").toMutableMap()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginFunction(view: View) {

        val userName = findViewById<EditText>(R.id.userName).text.toString()
        val userPasswd = findViewById<EditText>(R.id.userPasswd).text.toString()
        if (userName.isEmpty() || userPasswd.isEmpty()){
            val message = AlertDialog.Builder(this)
            message.setTitle("Error al iniciar sesión")
            message.setMessage("Complete los datos de inicio")
            val popup = message.create()
            popup.show()
            return
        }
        if (data[userName]!=userPasswd) {
            val message = AlertDialog.Builder(this)
            message.setTitle("Error al iniciar sesión")
            message.setMessage("Usuario inexistente o contraseña incorrecta")
            val popup = message.create()
            popup.show()
            return
        }
        val welcomePage = Intent(this, WelcomeActivity::class.java)
        startActivity(welcomePage)
    }

    fun registerButton(view: View){
        val registerActivity = Intent(this, RegisterActivity::class.java)
        startActivity(registerActivity)
    }

}