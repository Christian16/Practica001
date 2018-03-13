package com.hermesis.christian.practica001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cuadro;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuadro = (EditText) findViewById(R.id.txtCadena);
        resultado=(TextView) findViewById(R.id.resultado);

    }

    //sintaxis para metodo de boton

    public void verificar(View v){

    //cuadro.setText("xxxxxxxxx");

        String cadena1 = cuadro.getText().toString();
        String cadena2="";


        for (int x= cadena1.length()-1; x >= 0; x--){
            cadena2= cadena2 + cadena1.charAt(x);
        }

        resultado.setText(cadena2);

    }




}
