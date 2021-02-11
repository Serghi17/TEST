package com.example.recuperacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    private TextView numero,nombre;
    private ImageView fotoNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        ImageView fotoNumero = (ImageView) findViewById(R.id.Foto);

        TextView nombre = (TextView) findViewById(R.id.txtNombre);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String datosNombre = bundle.getString("nombre");
            String datosNumero = bundle.getString("numero");

            nombre.setText(datosNombre);



            switch (datosNumero){
                case "uno": {
                    fotoNumero.setImageResource(R.drawable.descarga1);
                    break;
                }
                case "dos": {
                    fotoNumero.setImageResource(R.drawable.descarga2);
                    break;
                }
                case "tres":{
                    fotoNumero.setImageResource(R.drawable.descarga3);
                    break;
                }
                default:{
                    fotoNumero.setBackgroundResource(R.drawable.ic_launcher_background);
                    break;
                }

            }


        }

    }
}