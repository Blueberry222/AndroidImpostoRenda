package com.example.impostorenda;

public class PessoaFisica extends Pessoa  {

    public String CPF;

    @Override
    public double CalculaIR() {
        return 0;
    }
}
