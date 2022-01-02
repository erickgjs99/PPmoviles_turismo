package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_datos_generales.*

class FormDatosGenerales : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_datos_generales)
        btn_regresarDatos.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_siguienteDatos.setOnClickListener(){
            startActivity(Intent(this, UbicacionActivity::class.java))
        }
    }
}