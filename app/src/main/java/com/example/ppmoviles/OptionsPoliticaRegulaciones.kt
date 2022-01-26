package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_politica_regulaciones.*

class OptionsPoliticaRegulaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_politica_regulaciones)

        btn_regulacionesNo.setOnClickListener(){
            startActivity(Intent(this, OptionsActividadesPractican::class.java))
        }

        btn_regulacionesSi.setOnClickListener(){
            startActivity(Intent(this, PoliticasyRegulaciones::class.java))
        }
    }
}