package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_accesibilidad.*

class OptionsAccesibilidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_accesibilidad)
        btn_optionsNo.setOnClickListener(){
            startActivity(Intent(this, OptionsConservacionAtractivo::class.java))
        }
        btn_optionsSi.setOnClickListener(){
            startActivity(Intent(this, AccesibilidadActivity::class.java))
        }
    }

}