package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro_visitantes_afluencia.*

class RegistroVisitantesAfluencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_visitantes_afluencia)


        btn_regresarRegistroVisit.setOnClickListener(){
            startActivity(Intent(this, OptionsActividadesPractican::class.java))
        }

        btn_siguienteRegistroVisit.setOnClickListener(){
            startActivity(Intent(this, RecursoHumano::class.java))
        }
    }
}