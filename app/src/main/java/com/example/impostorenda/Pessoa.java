package com.example.impostorenda;

public abstract class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Double renda;
    public abstract double CalculaIR();

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
}
