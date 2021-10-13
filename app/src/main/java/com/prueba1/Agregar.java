package com.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Agregar extends AppCompatActivity {
    Spinner sping;
    ArrayList <String>Generos= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        sping = (Spinner) findViewById(R.id.spinner2);
        Generos.add("...");
        Generos.add("Hombre");
        Generos.add("Mujer") ;

        ArrayAdapter<String>adaptado=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Generos);
        sping.setAdapter(adaptado);
    }
}