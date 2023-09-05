package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.35, 0.09);

        imprimir.accept(p1);
        Produto p2 = new Produto("borracha", 2.35, 0.08);
        Produto p3 = new Produto("lapis", 2.99, 0.09);
        Produto p4 = new Produto("caderno", 18.35, 0.15);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.desconto));
        produtos.forEach(System.out::println);



    }
}
