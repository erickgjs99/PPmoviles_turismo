package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import kotlinx.android.synthetic.main.activity_formularios_registrados.*
import kotlinx.android.synthetic.main.activity_main.*

class FormulariosRegistrados : AppCompatActivity() {
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formularios_registrados)

        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")


        setup(email?:"", provider?:"")
        btn_NuevoFormularioFormR.setOnClickListener(){
            startActivity(Intent(this,FormDatosGenerales::class.java))
        }
        btn_regresarFormR.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
    private fun setup(email:String, provider:String){

    }
}