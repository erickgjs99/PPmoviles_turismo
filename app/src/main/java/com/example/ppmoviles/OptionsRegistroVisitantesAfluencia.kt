package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_registro_visitantes_afluencia.*

class OptionsRegistroVisitantesAfluencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_registro_visitantes_afluencia)

        btn_registroVisitSi.setOnClickListener(){
            startActivity(Intent(this, RegistroVisitantesAfluencia::class.java))
        }

        btn_registroVisitNo.setOnClickListener(){
            startActivity(Intent(this, RecursoHumano::class.java))
        }
    }
}