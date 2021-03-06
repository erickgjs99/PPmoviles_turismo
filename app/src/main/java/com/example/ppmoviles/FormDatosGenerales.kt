package com.example.ppmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_formularios_registrados.*


class FormDatosGenerales : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var db: FirebaseFirestore
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

        setup()
        btn_regresarDatos.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
    private fun setup(){
        title ="Inicio"

        btn_siguienteDatos.setOnClickListener(){
            db = FirebaseFirestore.getInstance()
            db.collection("users").document().set(
                hashMapOf("nombre del atractivo" to t_nombreatractivo.text.toString(),
                    "categoria" to categoria.text.toString(), "tipo" to tipo.text.toString(),
                    "subtipo" to subtipo.text.toString())
            )
            var txt1 = "Datos Guardados"
            Toast.makeText(applicationContext,txt1, Toast.LENGTH_LONG).show()
            startActivity(Intent(this, UbicacionActivity::class.java))
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
        if(item == "Monta??as"){
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
        else if (item == "Aguas Subterr??neas"){
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
        }else if (item == "Fen??menos Espeleol??gicos"){
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
        }else if (item == "Fen??menos Geol??gicos"){
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
        }else if (item == "Realizaciones t??cnicas y cient??ficas"){
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