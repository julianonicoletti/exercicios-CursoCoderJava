package ExerciciosClasseMetodos2;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o Preço de Custo: R$ ");
        p1.setPrecoCusto(scanner.nextDouble());
        System.out.print("Informe o Valor de Venda: R$ ");
        p1.setPrecoVenda(scanner.nextDouble());
        p1.calcularMargemLucro();
        System.out.printf("Preço de Custo: \t\tR$ %.2f" +
                          "\nPreço de Venda: \t\tR$ %.2f" +
                          "\nMargem de Lucro: \t\tR$ %.2f" +
                          "\nMargem de Lucro Percentual: %.2f",
                p1.getPrecoCusto(), p1.getPrecoVenda(),
                p1.getMargemLucro(), p1.calcularMargemLucroPorcentagem());

    }
}
