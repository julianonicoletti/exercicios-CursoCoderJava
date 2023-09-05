package StreamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class imprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList ("Lu", "Gui", "Luca", "Ana");
        System.out.println ("usando o forEach....");
        for (String nome: aprovados) {
            System.out.println (nome);
        }
        System.out.println ("\nUsando iterator....");
        Iterator<String> it = aprovados.iterator ();
        while(it.hasNext ()) {
            System.out.println (it.next ());
        }
        System.out.println ("\n Usando Stream...");
        Stream<String> stream = aprovados.stream ();
        stream.sorted().forEach(System.out::println);


    }
}
