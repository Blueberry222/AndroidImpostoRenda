package com.example.impostorenda;

public class PessoaJuridica extends Pessoa {

    public String CNPJ;

    @Override
    public double CalculaIR() {
        return 0;
    }
}
