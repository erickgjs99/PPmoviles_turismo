package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_clima.*

class ClimaActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)

        btn_regresarClima.setOnClickListener(){
            startActivity(Intent(this, InformacionAdmin::class.java))
        }
        btn_siguienteClima.setOnClickListener(){
            startActivity(Intent(this, IngresoAtractivo::class.java))
        }

    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }
}