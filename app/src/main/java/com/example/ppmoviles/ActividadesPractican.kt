package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actividades_practican.*

class ActividadesPractican : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividades_practican)


        btn_regresarActividadesPractican.setOnClickListener(){
            startActivity(Intent(this, OptionsPoliticaRegulaciones::class.java))
        }

        btn_siguienteActividadesPractican.setOnClickListener(){
            startActivity(Intent(this, OptionsRegistroVisitantesAfluencia::class.java))
        }
    }
}