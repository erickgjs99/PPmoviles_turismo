package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clima.*
import kotlinx.android.synthetic.main.activity_form_datos_generales.*

class ClimaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)
        btn_regresarClima.setOnClickListener(){
            startActivity(Intent(this, UbicacionActivity::class.java))
        }
        btn_siguienteClima.setOnClickListener(){
            startActivity(Intent(this, AccesibilidadActivity::class.java))
        }
    }
}