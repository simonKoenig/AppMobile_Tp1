package com.example.myloggin

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

val data = mapOf("Juan Torres" to "1234utn", "santiago" to "santi", "Simon" to "Koenig").toMutableMap()

fun popupNotify(titulo: String, contenido: String,context: AppCompatActivity){
    val message = AlertDialog.Builder(context)
    message.setTitle(titulo)
    message.setMessage(contenido)
    val popup = message.create()
    popup.show()
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun loginFunction(view: View) {
        val userName = findViewById<EditText>(R.id.userName).text.toString()
        val userPasswd = findViewById<EditText>(R.id.userPasswd).text.toString()
        if (userName.isEmpty() || userPasswd.isEmpty()){
            popupNotify("Error al iniciar sesión","Complete los datos de inicio",this)
            return
        }
        if (data[userName]!=userPasswd) {
            val message = AlertDialog.Builder(this)
            popupNotify("Error al iniciar sesión","Usuario inexistente o contraseña incorrecta",this)
            return
        }
        val welcomePage = Intent(this, WelcomeActivity::class.java)
        welcomePage.putExtra("userName",userName)
        startActivity(welcomePage)
    }
    fun registerButton(view: View){
        val registerActivity = Intent(this, RegisterActivity::class.java)
        startActivity(registerActivity)
    }
}