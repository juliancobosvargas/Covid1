package com.example.covid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private  void enMapa(String grupo){
        Intent intento1 = new Intent(this, Mapa.class);
        //mandar parametros
        intento1.putExtra("grupo",grupo);
        startActivity(intento1);
    }

    public void hospitales(View view) {
        enMapa("hospitales");
    }

    public void clinicas(View view) {
        enMapa("clinicas");
    }

    public void postas(View view) {
        enMapa("postas");
    }

    public void mercados(View view) {
        enMapa("mercados");
    }
}