package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ac_temporalidad.*
import kotlinx.android.synthetic.main.activity_clima.*

class AcTemporalidadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_temporalidad)
        btn_regresarTemporalidad.setOnClickListener(){
            startActivity(Intent(this, AccesibilidadActivity::class.java))
        }
        btn_siguienteTemporalidad.setOnClickListener(){
            startActivity(Intent(this, AcFacilidadesActivity::class.java))
        }

    }
}