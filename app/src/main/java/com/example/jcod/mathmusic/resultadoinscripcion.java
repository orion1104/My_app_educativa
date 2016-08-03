package com.example.jcod.mathmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class resultadoinscripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadoinscripcion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i = getIntent();
        DatosCliente objCliente= (DatosCliente) i.getSerializableExtra("cliente");

        String nombre = objCliente.getStrnombre().toString();
        TextView objTextView1 = (TextView)findViewById(R.id.textView5);
        String apellido = objCliente.getGetapellido().toString();
        TextView objTextView2 = (TextView)findViewById(R.id.textView5);
        objTextView1.setText(nombre + apellido);
        String _sexo ="";
        if(objCliente.getSexo()== 1)
        {
           _sexo = "Masculino";
        }
        else
        {
            _sexo = "Femenino";
        }

        String correo = objCliente.getCorreo().toString();
        TextView texteViewDatos = (TextView)findViewById(R.id.textView6);
        texteViewDatos.setText(correo + "\n" +_sexo);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
