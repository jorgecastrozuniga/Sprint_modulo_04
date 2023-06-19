package com.example.sprint_modulo_05;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sprint_modulo_05.databinding.ActivityMain2Binding;
import com.example.sprint_modulo_05.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMain2Binding abinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        abinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(abinding.getRoot());

        //Se declara Intent
        Intent intento = getIntent();

        // proceso: Se pasan los datos para realizar link con RRSS y correo.
        abinding.botonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/jorge-castro-zu%C3%B1iga-7628b9100/";
                Intent intento = new Intent(Intent.ACTION_VIEW);
                intento.setData(Uri.parse(url));
                startActivity(intento);
            }
        });

        abinding.botonfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+56983760090";
                String whatsappUrl = "https://api.whatsapp.com/send?phone=" + phoneNumber;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(whatsappUrl));
                startActivity(intent);
            }
        });

        Log.d("prueba2", "aprete el boton");

        abinding.botonfab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentito = new Intent(Intent.ACTION_VIEW);
                intentito.setData(Uri.parse("mailto:jcastro@inaf.cl"));
                Log.i(TAG, "Utilizando Correo");
                startActivity(intentito);
            }
        });

        abinding.iconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        abinding.iconButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}


