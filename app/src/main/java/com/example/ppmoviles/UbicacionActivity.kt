package com.example.ppmoviles
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.gms.location.*
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import kotlinx.android.synthetic.main.activity_ubicacion.*
import java.util.*

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
            startActivity(Intent(this, InformacionAdmin::class.java))
        }


    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this@UbicacionActivity, item, Toast.LENGTH_SHORT).show()
        if (item == "AZUAY") {
            var cantones = resources.getStringArray(R.array.azuay_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "BOLIVAR"){
            val cantones = resources.getStringArray(R.array.bolivar_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "CAÑAR"){
            val cantones = resources.getStringArray(R.array.canar_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "CARCHI"){
            val cantones = resources.getStringArray(R.array.carchi_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "COTOPAXI"){
            val cantones = resources.getStringArray(R.array.cotopaxi_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "CHIMBORAZO"){
            val cantones = resources.getStringArray(R.array.chimborazo_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "El ORO"){
            val cantones = resources.getStringArray(R.array.eloro_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "ESMERALDAS"){
            val cantones = resources.getStringArray(R.array.esmeraldas_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "GUAYAS"){
            val cantones = resources.getStringArray(R.array.guayas_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "IMBABURA"){
            val cantones = resources.getStringArray(R.array.imbabura_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "LOJA"){
            val cantones = resources.getStringArray(R.array.loja_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "LOS RIOS"){
            val cantones = resources.getStringArray(R.array.losrios_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "MANABI"){
            val cantones = resources.getStringArray(R.array.manabi_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "MORONA SANTIAGO"){
            val cantones = resources.getStringArray(R.array.moronasantiago_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "NAPO"){
            val cantones = resources.getStringArray(R.array.napo_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "PASTAZA"){
            val cantones = resources.getStringArray(R.array.pastaza_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "PICHINCHA"){
            val cantones = resources.getStringArray(R.array.pichicha_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "TUNGURAGUA"){
            val cantones = resources.getStringArray(R.array.tungurahua_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "ZAMORA CHINCHIPE"){
            val cantones = resources.getStringArray(R.array.zamorachinchipe_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "GALAPAGOS"){
            val cantones = resources.getStringArray(R.array.galapagos_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "SUCUMBIOS"){
            val cantones = resources.getStringArray(R.array.sucumbios_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "ORELLANA"){
            val cantones = resources.getStringArray(R.array.orellana_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "SANTO DOMINGO DE LOS TSACHILAS"){
            val cantones = resources.getStringArray(R.array.santodomingotsachilas_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "SANTA ELENA"){
            val cantones = resources.getStringArray(R.array.santaelena_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "ZONAS EN ESTUDIO"){
            val cantones = resources.getStringArray(R.array.zonasenestudio_cantones)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                cantones
            )
            with(canton) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }

        // Parroquias

        if(item == "CUENCA"){
            val parroquias = resources.getStringArray(R.array.cuenca_parroquias)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                parroquias
            )
            with(parroquia) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }else if(item == "GIRON"){
            val parroquias = resources.getStringArray(R.array.giron_parroquias)
            val adapter = ArrayAdapter(
                this,
                R.layout.list_item,
                parroquias
            )
            with(parroquia) {
                setAdapter(adapter)
                onItemClickListener = this@UbicacionActivity
            }
        }



    }
}