package com.albertoochoa.AlbertoOchoaPro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registroVehiculos extends AppCompatActivity {

    Button btn_regresar_vehiculos;
    Button btn_registro_vehiculos;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_vehiculos);

        btn_regresar_vehiculos = findViewById(R.id.btn_regresar_vehiculos);
        btn_registro_vehiculos = findViewById(R.id.btn_registro_vehiculos);


        btn_regresar_vehiculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irvehiculosV();
            }
        });
        btn_registro_vehiculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irvehiculosRe();
            }
        });

    }

    public void irvehiculosV(){
        Intent intent = new Intent(this, Vehiculos.class);
        startActivity(intent);
    }

    public void irvehiculosRe(){
        Intent intent = new Intent(this, Vehiculos.class);
        startActivity(intent);
    }
}