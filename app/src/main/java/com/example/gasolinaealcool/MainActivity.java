package com.example.gasolinaealcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText precoAlcool;
        private EditText precoGasolina;
        private TextView textoResultado;
        private Button botaoVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.ID_ALCOOL);
        precoGasolina =(EditText) findViewById(R.id.ID_GASOLINA);
        textoResultado = (TextView) findViewById(R.id.ID_RECEBE);
        botaoVerificar = (Button) findViewById(R.id.ID_BUTTON);

        //recupera valores digitados
        String textoPrecoAlcool = precoAlcool.getText().toString();
        String textoPrecoGasolina = precoGasolina.getText().toString();

        //converter valores strings para numeros
        Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
        Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

        double resultado = valorAlcool / valorGasolina;

        if (resultado >= 0.7){
            //Gasolina
            textoResultado.setText("É melhor utilizar Gasolina");


        }else{
            textoResultado.setText("É melhor utilizar Alcool");

        }

    }
}
