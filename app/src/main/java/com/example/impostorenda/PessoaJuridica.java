package com.example.impostorenda;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, Double renda) {
        super(nome, renda);
    }

    @Override
    public double CalculaIR() {
        return super.getRenda() * 10/100;
    }
}
