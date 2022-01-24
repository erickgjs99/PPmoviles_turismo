package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formularios_registrados.*
import kotlinx.android.synthetic.main.activity_main.*

class FormulariosRegistrados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formularios_registrados)
        btn_NuevoFormularioFormR.setOnClickListener(){
            startActivity(Intent(this,FormDatosGenerales::class.java))
        }
        btn_regresarFormR.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}