package com.example.impostorenda;

public abstract class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Double renda;

    public Pessoa(String nome, Double renda) {
        super();
        this.nome = nome;
        this.renda = renda;
    }

    public abstract double CalculaIR();

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
}
