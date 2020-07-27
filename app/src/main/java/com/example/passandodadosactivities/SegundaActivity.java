package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade, textObjNome,textObjIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        textObjNome = findViewById(R.id.textObjNome);
        textObjIdade = findViewById(R.id.textObjIdade);

        //Recuperar dados Enviado
        Bundle dadosBundle = getIntent().getExtras();

        //set the values received for 1 activity
        String nome = dadosBundle.getString("nome2");
        int idade = dadosBundle.getInt("idade2");

        //Receber um OBJ via Bundle
        Usuario usuario = (Usuario) dadosBundle.getSerializable("obj");

        //Setando os valores entre Activity
        textNome.setText(nome);
        textIdade.setText(String.valueOf(idade));

        //Setando os Valores do OBJETO entre Activity
        textObjNome.setText(usuario.getNome());
        textObjIdade.setText(usuario.getEmail());





    }
}