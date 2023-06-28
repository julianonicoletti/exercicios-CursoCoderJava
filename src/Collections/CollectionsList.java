package Collections;

import java.util.ArrayList;

/**
 * Pode ser heterogeneo - assim como o Set não é bom
 * pode ser homogeneo
 * aceita obj duplicados
 * é ordenado
 * é indexado
 */
public class CollectionsList {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Juliano"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Cinthia"));
        System.out.println(lista.get(3).nome);
        System.out.println(lista.size());
        lista.remove(3);
        System.out.println(lista.remove(new Usuario("Juliano")));

        for (Usuario u:lista) {
            System.out.println(u.nome);
        }





    }

}
