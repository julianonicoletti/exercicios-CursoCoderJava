package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Funcao2 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Function<Integer, List> verificarParouimpar =
                num -> Arrays.asList((num % 2 == 0) ? pares.add(num) : impares.add(num));
        for (int i = 0; i < 50; i++) {
            verificarParouimpar.apply(i);

        }
        impares.removeIf(num -> num%5==0);
        pares.forEach(p -> System.out.print(p + ", "));
        impares.forEach(p -> System.out.print(p + ", "));

    }
}
