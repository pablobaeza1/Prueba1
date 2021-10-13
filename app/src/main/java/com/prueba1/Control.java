package com.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Control extends AppCompatActivity {

    TextView Total;
    TextView Hombres;
    TextView Mujeres;
    ImageButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        btn2 = (ImageButton) findViewById(R.id.imageButton);
        Total = (TextView) findViewById(R.id.Total);
        Hombres = (TextView) findViewById(R.id.Hombres);
        Mujeres = (TextView) findViewById(R.id.Mujeres);


        Bundle b = getIntent().getExtras();
        Integer totalp= b.getInt("contadorpers");
        Integer hombress= b.getInt("contadorhombre");
        Integer mujeress= b.getInt("contadormujer");

        Total.setText(""+totalp);
        Hombres.setText(""+hombress);
        Mujeres.setText(""+mujeress);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),Agregar.class);
                startActivity(I);
            }
        });
    }
}