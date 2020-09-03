package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private EditText campoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //captura do xml
        botao = findViewById(R.id.buttonok);
        campoTexto = findViewById(R.id.etNome);

        // Modelo de acao mais dificil
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoTexto.setText("Teste");
            }
        });

    }
    //Modelo de acao mais facil - Seleciona a acao pelo Design
    public void acaoBotao(View view){
        campoTexto.setText("teste teste");
        //Mostra uma notificacao Toast
        Toast.makeText(getApplicationContext(),"Ola"+campoTexto.getText(),Toast.LENGTH_LONG).show();

    }

}