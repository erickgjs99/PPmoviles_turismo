package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ac_facilidades.*
import kotlinx.android.synthetic.main.activity_accesibilidad.*

class AcFacilidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_facilidades)
        btn_regresarFacilidades.setOnClickListener(){
            startActivity(Intent(this, AcTemporalidadActivity::class.java))
        }
        btn_siguienteFacilidades.setOnClickListener(){
            startActivity(Intent(this, ConectividadActivity::class.java))
        }
    }
}