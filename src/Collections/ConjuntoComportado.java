package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");
        
        for(String candidato: lista) {
            System.out.println(candidato);

        }
    }

}
