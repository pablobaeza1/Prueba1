package com.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =(EditText) findViewById(R.id.usuario);
        password =(EditText) findViewById(R.id.contraseña);
        btn =(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().isEmpty()||password.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su usuario y Contrasena",Toast.LENGTH_LONG).show();
                }

                String ussr=user.getText().toString();
                String contra=password.getText().toString();
                if (ussr.equals("adm123")&contra.equals("adm123")){
                    Intent I=new Intent(getApplicationContext(),Control.class);
                    I.putExtra("usuar",ussr);
                    I.putExtra("contraa",contra);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Los datos son incorrectos",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}