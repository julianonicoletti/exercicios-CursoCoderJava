package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class metodoMAP {
    public static void main(String[] args) {
        Consumer<Integer> printInteiro = x -> System.out.print (x + " ");
        Consumer<String> printString = x -> System.out.print (x + " ");

        List<String> marcas = Arrays.asList ("BMW ", "Ferrari ", "Audi  ", "Honda\n ");
        marcas.stream().map(m -> m.toUpperCase ()).forEach (printString);

        UnaryOperator<String> maiscula = n -> n.toUpperCase ();
        UnaryOperator<String> primeiraletra = n -> n.charAt (0) + " ";
        UnaryOperator<String> grito = n -> n + "!!!!";
        marcas.stream()
                .map(maiscula)
                .map(n -> n.charAt (0))
                .map(n -> n + "!!!!")
                .forEach (printString);

        List<Integer> inteiros = Arrays.asList (1, 5, 9, 3, 8, 11, 45, 123);
        inteiros.forEach (printInteiro);
        inteiros.stream().map(m -> m*3).map(m -> m*-1).sorted().forEach (printInteiro);

    }
}
