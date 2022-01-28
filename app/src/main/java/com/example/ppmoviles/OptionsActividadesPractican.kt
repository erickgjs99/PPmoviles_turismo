package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_actividades_practican.*

class OptionsActividadesPractican : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_actividades_practican)

        btn_actNo.setOnClickListener(){
            startActivity(Intent(this, OptionsRegistroVisitantesAfluencia::class.java))
        }

        btn_actSi.setOnClickListener(){
            startActivity(Intent(this, ActividadesPractican::class.java))
        }
    }
}