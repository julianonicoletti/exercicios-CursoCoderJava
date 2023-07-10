package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Queue<Usuario> fila2 = new LinkedList<>();
        fila2.add(new Usuario("ariovaldo"));

        //os 2 adicionam elementos fila
        //se a fila estiver cheia, add=retorna exceção, offer=retorna false
        fila.add("Juliano");
        fila.offer("Cinthia");
        fila.add("Pedro");
        fila.offer("Gabriel");
        fila.add("Misty");
        //os 2 retornam o primeiro da fila.
        // diferença: peek= retorna null caso não tenha próximo
        // element= retorna exceção
        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println(fila.poll());//mostra o próximo da lista e retira dela
        System.out.println(fila.poll());// se não existir, retorna null
        System.out.println(fila.remove());//tb mostra o próximo mas se não houver próximo gera exceção


        for (String x:fila) {
            System.out.println(x);

        }
    }
}
