package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_accesibilidad.*
import kotlinx.android.synthetic.main.activity_options_accesibilidad.*

class OptionsAccesibilidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_accesibilidad)
        btn_optionsNo.setOnClickListener(){
            //startActivity(Intent(this, FormDatosGenerales::class.java))
        }
        btn_optionsSI.setOnClickListener(){
            startActivity(Intent(this, AccesibilidadActivity::class.java))
        }
    }

}