package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;

public class ExemplosChatGPT {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);
        numeros.add(15);
        numeros.add(10);
        numeros.add(9);
        numeros.add(18);
        numeros.add(22);
        numeros.add(2);
        numeros.add(25);
        numeros.add(21);
        numeros.add(16);

        numeros.removeIf(numero -> numero %2 != 0);
        Collections.sort(numeros, (numero1, numero2) -> numero1.compareTo(numero2));
        System.out.println(numeros);



    }
}
