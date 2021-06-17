package com.example.gestordereparto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = (ImageView)findViewById(R.id.idLogo);
        logo.setBackgroundDrawable(null);
        btnIniciar = (Button)findViewById(R.id.btnInicioSesion);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irOtraPagina(v);
            }
        });
    }

    public void irOtraPagina(View view){
        Intent siguiente = new Intent(this, menu_botones.class);
        startActivity(siguiente);

    }
}