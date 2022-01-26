package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_politicasy_regulaciones.*

class PoliticasyRegulaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politicasy_regulaciones)


        btn_regresarPoliticasRegulaciones.setOnClickListener(){
            startActivity(Intent(this, OptionsHigieneTuristica::class.java))
        }

        btn_siguientePoliticasRegulaciones.setOnClickListener(){
            startActivity(Intent(this, OptionsActividadesPractican::class.java))
        }
    }
}