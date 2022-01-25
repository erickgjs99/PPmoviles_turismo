package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_conservacion_atractivo.*

class OptionsConservacionAtractivo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_conservacion_atractivo)
        btn_no.setOnClickListener(){
            startActivity(Intent(this, OptionsHigieneTuristica::class.java))
        }
        btn_si.setOnClickListener(){
            startActivity(Intent(this, IntegracionAtractivo::class.java))
        }

    }
}