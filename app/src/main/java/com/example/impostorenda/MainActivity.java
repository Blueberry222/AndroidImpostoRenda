package com.example.impostorenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nomePessoa = findViewById(R.id.editTextNomePesssoa);
        EditText renda = findViewById(R.id.editTextRenda);
        Switch switchPJ = findViewById(R.id.switchPJ);
        Button btInserir = findViewById(R.id.Inserir);
        TextView resposta = findViewById(R.id.resposta);

        List<Pessoa> listaPessoas = new ArrayList<>();

        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}