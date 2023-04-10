package com.example.impostorenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Button finalizar = findViewById(R.id.Finalizar);
        TextView resposta = findViewById(R.id.resposta);

        List<Pessoa> listaPessoas = new ArrayList<>();

        Comparator<Pessoa> comparador = new Comparator<Pessoa>() {
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };

        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchPJ.isChecked()){
                    PessoaJuridica pj = new PessoaJuridica(null, null);
                    pj.setNome(nomePessoa.getText().toString());
                    pj.setRenda(Double.parseDouble(renda.getText().toString()));
                    listaPessoas.add(pj);
                    // Insere PJ
                } else {
                    PessoaFisica pf = new PessoaFisica(null, null);
                    pf.setNome(nomePessoa.getText().toString());
                    pf.setRenda(Double.parseDouble(renda.getText().toString()));
                    listaPessoas.add(pf);
                    // Insere PF
                }

            }
        });

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(listaPessoas, comparador);
                for (Pessoa p : listaPessoas){
                    resposta.append("Nome: " + p.getNome() + " - Imposto: " + p.CalculaIR() + " - Natureza: " + p.getClass().getSimpleName() + "\n");
                }
            }
        });
    }
}