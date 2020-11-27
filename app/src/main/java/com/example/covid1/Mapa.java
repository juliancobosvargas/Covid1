package com.example.covid1;

import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private String Grupo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        //verifico servicios de google play (disponible y actualizado)
        int estado = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if(estado == ConnectionResult.SUCCESS){
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            //mensaje
            Dialog mensaje = GooglePlayServicesUtil.getErrorDialog(estado,(Activity)getApplicationContext(),10);
            mensaje.show();
        }
        Grupo = getIntent().getStringExtra("grupo");

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // tipo de mapa:
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //habilitar mapas ya q estan desabilidatas
        UiSettings configuro = mMap.getUiSettings();
        configuro.setZoomControlsEnabled(true);
        
        // Add a marker in Sydney and move the camera
        LatLng cusco = new LatLng(-13.51670778891933, -71.9786738599814);
        mMap.addMarker(new MarkerOptions().position(cusco).title("Centro del Cusco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cusco,13));

        //variable google map escucha eventos del marcador
        googleMap.setOnMarkerClickListener(this);
        //para usar la funcion onMarkerClick

        //sabiendo q en el splash atividad : Biendenido
        //se lleno mis datos de lugares, procedo
        switch (Grupo){
            case "hospitales":
                for (Milugar lugar: Miglobal.ListaHospitales) {
                    LatLng ubi = new LatLng(lugar.getLatitu(),lugar.getLongit());
                    mMap.addMarker(new MarkerOptions()
                        .position(ubi)
                            .title(lugar.getTitulo())
                            .snippet(lugar.getDescri())
                            .icon(BitmapDescriptorFactory.fromResource(lugar.getImagen()))
                    );
                }
                break;
            case "clinicas":
                for (Milugar lugar: Miglobal.ListaClinicas) {
                    LatLng ubi = new LatLng(lugar.getLatitu(),lugar.getLongit());
                    mMap.addMarker(new MarkerOptions()
                            .position(ubi)
                            .title(lugar.getTitulo())
                            .snippet(lugar.getDescri())
                            .icon(BitmapDescriptorFactory.fromResource(lugar.getImagen()))
                    );
                }
                break;
            case "postas":
                for (Milugar lugar: Miglobal.ListaPostas) {
                    LatLng ubi = new LatLng(lugar.getLatitu(),lugar.getLongit());
                    mMap.addMarker(new MarkerOptions()
                            .position(ubi)
                            .title(lugar.getTitulo())
                            .snippet(lugar.getDescri())
                            .icon(BitmapDescriptorFactory.fromResource(lugar.getImagen()))
                    );
                }
                break;
            case "mercados":
                for (Milugar lugar: Miglobal.ListaMercados) {
                    LatLng ubi = new LatLng(lugar.getLatitu(),lugar.getLongit());
                    mMap.addMarker(new MarkerOptions()
                            .position(ubi)
                            .title(lugar.getTitulo())
                            .snippet(lugar.getDescri())
                            .icon(BitmapDescriptorFactory.fromResource(lugar.getImagen()))
                    );
                }
                break;
        }

    }

    public void hibrido(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }

    public void normal(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    public void satelital(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }

    public void terreno(View view) {
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    public void regresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        String nom,lat,lng;
        nom = marker.getTitle();
        lat = Double.toString(marker.getPosition().latitude);
        lng = Double.toString(marker.getPosition().longitude);
        Toast.makeText(this,nom + "\n lat: " + lat + "\n lon: " + lng,Toast.LENGTH_LONG).show();
        return false;
    }
}