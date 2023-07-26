package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente (String nome) {
        this.nome = nome;
    }

    double obterValorTotal () {
        double total = 0;
        for (Compra compra: compras) {
            total += compra.obterValorCompra();
        }
        return total;
        
    }

}
