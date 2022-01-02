package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clima.*
import kotlinx.android.synthetic.main.activity_conectividad.*

class ConectividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conectividad)
        btn_regresarConectividad.setOnClickListener(){
            startActivity(Intent(this, AcFacilidadesActivity::class.java))
        }
        btn_siguienteConectividad.setOnClickListener(){
            startActivity(Intent(this, AccesibilidadActivity::class.java))
        }
    }
}