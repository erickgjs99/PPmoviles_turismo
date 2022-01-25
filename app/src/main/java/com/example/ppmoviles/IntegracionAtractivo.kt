package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_integracion_atractivo.*

class IntegracionAtractivo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_integracion_atractivo)

        btn_regresarIntegracionAtractivo.setOnClickListener(){
            startActivity(Intent(this, OptionsAccesibilidad::class.java))
        }
        btn_siguienteIntegracionAtractivo.setOnClickListener(){
            startActivity(Intent(this, OptionsHigieneTuristica::class.java))
        }
    }


}