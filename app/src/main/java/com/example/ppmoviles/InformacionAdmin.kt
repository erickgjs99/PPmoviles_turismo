package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_informacion_admin.*
import kotlinx.android.synthetic.main.activity_ubicacion.*

class InformacionAdmin : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_admin)

        btn_regresarInformacionAdmin.setOnClickListener(){
            startActivity(Intent(this, UbicacionActivity::class.java))
        }
        btn_siguienteInformacionAdmin.setOnClickListener(){
            startActivity(Intent(this, ClimaActivity::class.java))
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }
}