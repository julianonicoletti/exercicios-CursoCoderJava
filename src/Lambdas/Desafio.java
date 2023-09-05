package Lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.Double.parseDouble;
import static java.lang.String.format;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto("ipad", 3200.84, 0.15);

        Function<Produto, Double> precoComDesconto = produto ->
                (p1.preco-(p1.preco * p1.desconto));
        System.out.println(precoComDesconto.apply(p1));

        UnaryOperator<Double> precoComImposto = preco -> {
            return preco >= 2500 ? (preco + (preco*0.085)) : preco;
        };
        System.out.println(precoComDesconto.andThen(precoComImposto).apply(p1));

        UnaryOperator<Double> adicionarFrete =
                frete -> frete >= 3000 ? frete+100 : frete+50;

        System.out.println(precoComDesconto.
                andThen(precoComImposto).
                andThen(adicionarFrete).
                apply(p1));

        Function<Double, String> duasCasasDecimais =
                casas -> String.format("%.2f", casas);

        Function<String, String> saidaFormatada =
                texto -> "R$" + texto;

        System.out.println(precoComDesconto.
                andThen(precoComImposto).
                andThen(adicionarFrete).
                andThen(duasCasasDecimais).
                andThen(saidaFormatada)
                .apply(p1));






    }
}
