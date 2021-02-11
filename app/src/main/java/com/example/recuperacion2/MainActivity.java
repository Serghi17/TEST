package com.example.recuperacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton uno, dos, tres;
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rGroup);
        uno = (RadioButton) findViewById(R.id.rbUno);
        dos = (RadioButton) findViewById(R.id.rbDos);
        tres = (RadioButton) findViewById(R.id.rbTres);
        nombre = (EditText) findViewById(R.id.etNombre);



    }




    public void Siguiente(View view){

        String datosNombre = nombre.getText().toString();

        String numero = "";
        if(uno.isChecked()){
            numero = "uno";
        }
        else if(dos.isChecked()){
            numero = "dos";
        }
        else if(tres.isChecked()){
            numero = "tres";
        }
        else{
            Toast.makeText(getApplicationContext(), "Error, tienes que seleccionar un boton para mandar datos",Toast.LENGTH_LONG).show();
        }



        Intent i = new Intent(this, Pantalla2.class);
        i.putExtra("nombre", datosNombre);
        i.putExtra("numero", numero);
        startActivity(i);
    }
}