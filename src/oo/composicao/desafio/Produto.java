package oo.composicao.desafio;

public class Produto {


    private double preco;
    String nome;

    Produto (String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
}