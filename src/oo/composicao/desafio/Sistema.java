package oo.composicao.desafio;

import java.util.Scanner;

public class Sistema {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        Cliente cliente2 = new Cliente(scanner.nextLine());

        System.out.println("Digite o nome do produto: ");
        String nomeProdutoTemp = scanner.nextLine();

        System.out.println("Digite o preço do produto: R$ ");
        double precoProdutotemp = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantProdutoTemp = scanner.nextInt();
        Compra compra5 = new Compra();
        compra5.adicionarItem(nomeProdutoTemp, precoProdutotemp, quantProdutoTemp);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.66, 100);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem("Notebook", 1980, 2);

        Compra compra3 = new Compra();
        compra3.adicionarItem(new Produto("Impressora", 1890.80), 2);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);
        cliente.compras.add(compra3);
        cliente.compras.add(compra5);



        System.out.println(cliente.obterValorTotal());




    }
}
