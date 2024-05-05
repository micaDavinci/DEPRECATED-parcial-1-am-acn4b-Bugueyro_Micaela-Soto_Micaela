package com.example.gestiondegastos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ar.edu.davinci.gestor_de_gastos.R;


public class MainActivity extends AppCompatActivity {
    private Button botonIngreso, botonGasto;
    private EditText inputCategoria, inputMonto;
    private TextView categoria1, monto1;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIngreso = (Button) findViewById(R.id.botonIngreso);
        botonGasto = (Button) findViewById(R.id.botonGasto);
        inputCategoria = findViewById(R.id.inputCategoria);
        inputMonto = findViewById(R.id.inputMonto);
        categoria1 = findViewById(R.id.categoria1);
        monto1 = findViewById(R.id.monto1);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        botonGasto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Categoria c1 = new Categoria();
                c1.setNombre(inputCategoria.getText().toString());
                c1.setMonto(Double.parseDouble(inputMonto.getText().toString()));
                categoria1.setText(c1.getNombre());
            }
            
        });

    }

}


