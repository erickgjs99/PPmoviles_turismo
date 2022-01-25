package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_options_higiene_turistica.*

class OptionsHigieneTuristica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_higiene_turistica)
        btn_opNo.setOnClickListener(){
            //startActivity(Intent(this, HigieneSeguridadTuristica::class.java))
        }

        btn_opSi.setOnClickListener(){
            startActivity(Intent(this, HigieneSeguridadTuristica::class.java))
        }
    }
}