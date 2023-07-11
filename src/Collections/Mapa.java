package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Pedro");
        usuarios.put(3, "Cinthia");
        usuarios.put(4, "Juliano");

        System.out.println(usuarios.toString());

        Map<Integer, String> teste = new HashMap<>();
        teste.put(8, "Cinthia");
        teste.put(134, "Arlindo");
        System.out.println(teste.toString());


        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.get(1));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
            
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + ": ");
            System.out.println(registro.getValue());
        }


    }
}
