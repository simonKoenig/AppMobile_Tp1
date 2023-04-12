package com.example.myloggin

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginFunction(view: View) {
        val data = mapOf("Juan Torres" to "1234utn")
        val userName = findViewById<EditText>(R.id.userName).text.toString()
        val userPasswd = findViewById<EditText>(R.id.userPasswd).text.toString()
        if (userName.isEmpty() || userPasswd.isEmpty()){
            val message = AlertDialog.Builder(this)
            message.setTitle("Error al iniciar sesión")
            message.setMessage("Complete los datos de inicio")
            val popup = message.create()
            popup.show()
        }
        if (data[userName]==userPasswd){
            val message = AlertDialog.Builder(this)
            message.setTitle("Error al iniciar sesión")
            message.setMessage("Usuario inexistente o contraseña incorrecta")
            val popup = message.create()
            popup.show()
        }
    }

}