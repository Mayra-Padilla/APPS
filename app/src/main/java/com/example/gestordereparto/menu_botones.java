package com.example.gestordereparto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menu_botones extends AppCompatActivity {
    private ImageButton info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_botones);
        info = (ImageButton)findViewById(R.id.btnInforme);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAinformes(v);
            }
        });
    }
    public void irAinformes(View view){
        Intent informePag = new Intent(this, pedidos.class);
        startActivity(informePag);
    }

}