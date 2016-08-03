package com.example.jcod.mathmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        Button btnUno =(Button)findViewById(R.id.btninscribirse);
        btnUno.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent in = new Intent(presentacion.this, rminscripcion.class);
                startActivity(in);
            }
        });
    }
}
