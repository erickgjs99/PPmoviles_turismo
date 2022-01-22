package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_accesibilidad.*

class AccesibilidadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesibilidad)
        btn_regresarAccesibilidad.setOnClickListener(){
            startActivity(Intent(this, ClimaActivity::class.java))
        }
        btn_siguienteIngAtractivo.setOnClickListener(){
            startActivity(Intent(this, AcTemporalidadActivity::class.java))
        }
    }
}