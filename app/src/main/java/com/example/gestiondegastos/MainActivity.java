package com.example.gestiondegastos;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private Button botonIngreso;
    private Button botonGasto;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIngreso = (Button) findViewById(R.id.botonIngreso);
        botonGasto = (Button) findViewById(R.id.botonGasto);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        botonGasto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            } // gastos
            
        });


    }
}


