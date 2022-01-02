package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ppmoviles.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_form_datos_generales.*

class FormDatosGenerales : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_form_datos_generales)

        val opciones = resources.getStringArray(R.array.categoria)
        val tipo = resources.getStringArray(R.array.tipo)
        val adapter = ArrayAdapter(
            this,
            R.layout.list_item,
            opciones
        )
        val adapter2 = ArrayAdapter(
            this,
            R.layout.list_item,
            tipo
        )
        with(autoCompleteTextView){
          setAdapter(adapter)
            onItemClickListener = this@FormDatosGenerales
        }
        with(autoCompleteTextView2){
            setAdapter(adapter2)
            onItemClickListener = this@FormDatosGenerales
        }
        btn_regresarDatos.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_siguienteDatos.setOnClickListener(){
            startActivity(Intent(this, UbicacionActivity::class.java))
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this@FormDatosGenerales,item,Toast.LENGTH_SHORT).show()
    }
}