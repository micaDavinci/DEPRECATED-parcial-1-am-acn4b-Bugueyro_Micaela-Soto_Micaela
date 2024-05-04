package com.example.gestiondegastos;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import ar.edu.davinci.gestor_de_gastos.R;

public class MainActivity extends AppCompatActivity {
    private Button botonIngreso, botonGasto;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIngreso = (Button) findViewById(R.id.botonIngreso);
        botonGasto = (Button) findViewById(R.id.botonGasto);

        /*
        botonIngreso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        botonGasto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            } // gastos
            
        });
        */
    }

    public void agrgarGasto(View view){
        LinearLayout agrgarGasto = findViewById(R.id.agrgarGasto);
        EditText nombre = new EditText(this);
        nombre.setText("Alquiler");
    }

    public void agregar(View view){

    }
}


