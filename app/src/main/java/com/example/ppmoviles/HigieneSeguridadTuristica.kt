package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_higiene_seguridad_turistica.*

class HigieneSeguridadTuristica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higiene_seguridad_turistica)

        btn_regresarHigieneTuristica.setOnClickListener(){
            startActivity(Intent(this, OptionsConservacionAtractivo::class.java))
        }

        btn_sigHigieneTuristica.setOnClickListener(){
            startActivity(Intent(this, OptionsPoliticaRegulaciones::class.java))
        }
    }
}