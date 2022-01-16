package com.example.ppmoviles

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import com.example.ppmoviles.databinding.ActivityUbicacionBinding
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.*
import kotlinx.android.synthetic.main.activity_form_datos_generales.*
import kotlinx.android.synthetic.main.activity_ubicacion.*
import com.google.android.gms.location.FusedLocationProviderClient
import java.util.*

class UbicacionActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    // Variables para la ubicacion
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    //Determinamos un permiso para la API
    val PERMISSION_ID = 42
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

        // Ubicacion - latitud y longitug
        if (allPermissionsGrantedGPS()){
            mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        } else {
            // Si no hay permisos solicitarlos al usuario.
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION), PERMISSION_ID)
        }
        btndetectar.setOnClickListener {
            leerubicacionactual()
        }

    }
    private fun allPermissionsGrantedGPS() = REQUIRED_PERMISSIONS_GPS.all {
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    private fun leerubicacionactual(){
        //Evaluar los permiso de la app
        if (checkPermissions()){
            // Evaluar activacion de la ubicacion
            if (isLocationEnabled()){
                // Evaluar los permisos del usuario
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    mFusedLocationClient.lastLocation.addOnCompleteListener(this){ task ->
                        var location: Location? = task.result
                        if (location == null){
                            requestNewLocationData()
                        } else {
                            // Presentar las coordenadas
                            lbllatitud.text = location.latitude.toString()
                            lbllongitud.text = location.longitude.toString()
                            // Geocoder - Clase de codificacion geografica
                            var geoCoder = Geocoder(this, Locale.getDefault())
                            var Adress = geoCoder.getFromLocation(location.latitude,location.longitude,3)
                        }
                    }

                }
            } else {
                Toast.makeText(this, "Activar ubicación", Toast.LENGTH_SHORT).show()
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
                this.finish()
            }
        } else {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION), PERMISSION_ID)
        }
    }
    @SuppressLint("MissingPermission")
    // Obtener actualizaciones de ubicacion
    private fun requestNewLocationData(){
        var mLocationRequest = LocationRequest()
        mLocationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        mLocationRequest.interval = 0
        mLocationRequest.fastestInterval = 0
        mLocationRequest.numUpdates = 1
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        //mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallBack, Looper.myLooper())
    }
    // Constructor - Evalua cambios en la disponibilidad de los datos de ubicacion
    private val mLocationCallBack = object : LocationCallback(){
        override fun onLocationResult(locationResult: LocationResult) {
            var mLastLocation : Location = locationResult.lastLocation
        }
    }
    // Permiso si el GPS esta habilitada
    private fun isLocationEnabled(): Boolean {
        var locationManager: LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )
    }
    // Verificar permisos de la aplicacion que fueron implementados
    private fun checkPermissions(): Boolean {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        ) {
            return true
        }
        return false
    }
    // Recibe los permisos
    companion object {
        private val REQUIRED_PERMISSIONS_GPS= arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)
    }



    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }
}