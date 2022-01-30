package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")


        setup(email?:"", provider?:"")

        btn_nuevoFormulario.setOnClickListener(){
            startActivity(Intent(this,FormDatosGenerales::class.java))

        }
        btn_formRegistrados.setOnClickListener(){
            startActivity(Intent(this,FormulariosRegistrados::class.java))
        }
        btn_adminUser.setOnClickListener(){
            startActivity(Intent(this,AdminUser::class.java))
        }

        btn_cerraSesion.setOnClickListener(){
            var txt1 = "Usted a cerrado sesión"
            Toast.makeText(applicationContext,txt1, Toast.LENGTH_LONG).show()
            startActivity(Intent(this,AuthActivity::class.java))
        }
    }
    private fun setup(email:String, provider:String){
        title ="Inicio"
        correo_usuario.text=email
    }
}