package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.itens.add(new Item("caneta", 5, 7.45));
        compra1.itens.add(new Item("borracha", 3, 5.50));
        compra1.itens.add(new Item("caderno", 3, 18.90));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

    }
}
