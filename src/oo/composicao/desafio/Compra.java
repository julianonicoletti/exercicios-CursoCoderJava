package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    static ArrayList<Item> itens = new ArrayList<>();

    public static ArrayList<Item> getItens() {
        return itens;
    }

    void adicionarItem(Produto p, int qtde) {
        this.itens.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        this.itens.add(new Item(new Produto(nome, preco), qtde));
    }

    double obterValorCompra() {
        double total = 0;
        for(Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
