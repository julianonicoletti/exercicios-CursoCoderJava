package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {


        BinaryOperator<Double> calc = (x, y) -> {return x + y;};
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> {return x * y;};
        System.out.println(calc.apply(4.0, 5.0));

        Calculo calculo2 = (x, y) -> {
            return (x * y) / 10 + 100;
        };

        System.out.println(calculo2.executar(20, 30));

        calculo2 = (x, y) -> (x * y) + x / 10 + (1000);

        System.out.println(calculo2.executar(100, 160));
    }
}
