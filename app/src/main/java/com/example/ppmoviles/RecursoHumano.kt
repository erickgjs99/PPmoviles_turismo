package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recurso_humano.*

class RecursoHumano : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recurso_humano)


        btn_regresarRecursosHumanos.setOnClickListener(){
            startActivity(Intent(this, OptionsRegistroVisitantesAfluencia::class.java))
        }

        btn_guardarRecursosHumanos.setOnClickListener(){

        }
    }
}