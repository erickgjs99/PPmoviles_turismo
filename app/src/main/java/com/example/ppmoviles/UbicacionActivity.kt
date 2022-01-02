package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import kotlinx.android.synthetic.main.activity_ubicacion.*

class UbicacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion)

        btn_regresarUbicacion.setOnClickListener(){
            startActivity(Intent(this, FormDatosGenerales::class.java))
        }
        btn_siguienteUbicacion.setOnClickListener(){
            startActivity(Intent(this, ClimaActivity::class.java))
        }
    }
}