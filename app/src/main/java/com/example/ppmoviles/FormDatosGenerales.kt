package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class FormDatosGenerales : AppCompatActivity(), AdapterView.OnItemClickListener {

    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_datos_generales)
        val bundle:Bundle?=intent.extras
        val email:String? = bundle?.getString("email")
        val provider:String? = bundle?.getString("provider")

        val opciones = resources.getStringArray(R.array.categoria)
        val adapter = ArrayAdapter(
            this,
            R.layout.list_item,
            opciones
        )
        with(categoria){
            setAdapter(adapter)
            onItemClickListener = this@FormDatosGenerales
        }


        setup(email?:"", provider?:"")

        btn_regresarDatos.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_siguienteDatos.setOnClickListener(){
            startActivity(Intent(this, UbicacionActivity::class.java))
        }
    }
    private fun setup(email:String, provider:String){
        btn_guardar.setOnClickListener(){
            db.collection("users").document(email).set(
                hashMapOf("provider" to provider,"nombre del atractivo" to t_nombreAtractivo)
            )
            var txt1 = "Datos Guardados"
            Toast.makeText(applicationContext,txt1, Toast.LENGTH_LONG).show()
        }
    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this@FormDatosGenerales,item,Toast.LENGTH_SHORT).show()
        // Tipo por cada categoria
        if (item == "Atractivos Naturales"){
            val tipo_atractivos = resources.getStringArray(R.array.tipo_atractivos)
            val adapter3 = ArrayAdapter(
                this,
                R.layout.list_item,
                tipo_atractivos
            )
            with(tipo){
                setAdapter(adapter3)
                onItemClickListener = this@FormDatosGenerales
            }
        }else{
            val tipo_manifestaciones = resources.getStringArray(R.array.tipo_manifestaciones)
            val adapter4 = ArrayAdapter(
                this,
                R.layout.list_item,
                tipo_manifestaciones
            )
            with(tipo){
                setAdapter(adapter4)
                onItemClickListener = this@FormDatosGenerales
            }
        }
        //Subtipo por cada tipo - Atractivos
        if(item == "Montañas"){
            val subTipo_montanas = resources.getStringArray(R.array.subTipo_montanas)
            val adapter6 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_montanas
            )
            with(subtipo){
                setAdapter(adapter6)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if(item == "Planicies"){
            val subTipo_planicies = resources.getStringArray(R.array.subTipo_planicies)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_planicies
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        } else if(item == "Desiertos"){
            val subTipo_desiertos = resources.getStringArray(R.array.subTipo_desiertos)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_desiertos
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        } else if(item == "Ambientes Lacustres"){
            val subTipo_lacustres = resources.getStringArray(R.array.subTipo_ambLacustres)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_lacustres
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Rios"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
            // DESDE CAMBIAR FORMULARIO
        }else if (item == "Bosques"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }
        else if (item == "Aguas Subterráneas"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Fenómenos Espeleológicos"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Fenómenos Geológicos"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Costas o Litorales"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Ambientes Marinos"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Tierras Isulares"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }
        //Subtipo por cada tipo - Manifestaciones
        if(item == "Arquitectura"){
            val subTipo_montanas = resources.getStringArray(R.array.subTipo_montanas)
            val adapter6 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_montanas
            )
            with(subtipo){
                setAdapter(adapter6)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Folcklore"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Folcklore"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Realizaciones técnicas y científicas"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }else if (item == "Acontecimientos programados"){
            val subTipo_rios = resources.getStringArray(R.array.subTipo_Rios)
            val adapter5 = ArrayAdapter(
                this,
                R.layout.list_item,
                subTipo_rios
            )
            with(subtipo){
                setAdapter(adapter5)
                onItemClickListener = this@FormDatosGenerales
            }
        }



    }
}