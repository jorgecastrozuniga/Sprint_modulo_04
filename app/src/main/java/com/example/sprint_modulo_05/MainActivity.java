package com.example.sprint_modulo_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.sprint_modulo_05.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding vbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista binding
        vbinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(vbinding.getRoot());


        // proceso: Se implementa boton para pasar a la siguiente actividad
        vbinding.botonflotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intento);
            }
        });
        Log.d("prueba", "aprete el boton");
    }
}


