package com.example.jcod.mathmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class rminscripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rminscripcion);
        Button btnDos =(Button)findViewById(R.id.btninscribirse);
        btnDos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                DatosCliente objCliente = new DatosCliente();
                EditText txtNombre = (EditText)findViewById(R.id.editText);
                String textoNombre = txtNombre.getText().toString();
                objCliente.setStrnombre(textoNombre);

                EditText txtApellido = (EditText)findViewById(R.id.editText2);
                String textoApellido = txtApellido.getText().toString();
                objCliente.setStrapellido(textoApellido);

                EditText txtCedula = (EditText)findViewById(R.id.editText3);
                String textoCedula = txtCedula.getText().toString();
                objCliente.setStrapellido(textoCedula);

                RadioButton radioButtonMasculino = (RadioButton) findViewById(R.id.radioButton);
                if(radioButtonMasculino.isChecked())
                {
                    //Masculino 1
                 objCliente.setSexo(1);
                }
                else
                {
                    //Femenino 0
                    objCliente.setSexo(0);
                }

                Intent in = new Intent(rminscripcion.this, resultadoinscripcion.class);
                in.putExtra("cliente", objCliente.getClass());
                startActivity(in);
            }
        });
    }
    private void capturaerDatos()
    {

    }
}
