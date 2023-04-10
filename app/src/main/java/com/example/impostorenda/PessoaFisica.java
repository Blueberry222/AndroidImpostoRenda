package com.example.impostorenda;

public class PessoaFisica extends Pessoa  {

    public PessoaFisica(String nome, Double renda) {
        super(nome, renda);
    }

    @Override
    public double CalculaIR() {
        if (super.getRenda() <= 1400) {
            return super.getRenda();
        } else if (super.getRenda() >= 1400.01 && super.getRenda() <= 2100) {
            return super.getRenda() * 10 / 100;
        } else if (super.getRenda() >= 2100.01 && super.getRenda() <= 2800) {
            return super.getRenda() * 15 / 100;
        } else if (super.getRenda() >= 2800.01 && super.getRenda() <= 3600) {
            return super.getRenda() * 25 / 100;
        } else {
            return super.getRenda() * 30 / 100;
        }
    }
}
