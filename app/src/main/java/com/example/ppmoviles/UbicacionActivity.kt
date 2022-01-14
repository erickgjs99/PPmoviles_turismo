package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import kotlinx.android.synthetic.main.activity_ubicacion.*

class UbicacionActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion)

        val provincias = resources.getStringArray(R.array.provincias)
        val adapter = ArrayAdapter(
            this,
            R.layout.list_item,
            provincias
        )
        with(provincia){
            setAdapter(adapter)
            onItemClickListener = this@UbicacionActivity
        }

        btn_regresarUbicacion.setOnClickListener(){
            startActivity(Intent(this, FormDatosGenerales::class.java))
        }
        btn_siguienteUbicacion.setOnClickListener(){
            startActivity(Intent(this, ClimaActivity::class.java))
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }
}