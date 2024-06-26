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

public class Servicios extends AppCompatActivity {

    Button btn_regresar_inicioS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_servicios);


        btn_regresar_inicioS = findViewById(R.id.btn_regresar_inicioS);

        btn_regresar_inicioS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VolverInicio();
            }
        });

    }

    public void VolverInicio(){
        Intent intent = new Intent(this, InicioAlbertoOchoa.class);
        startActivity(intent);
    }
}