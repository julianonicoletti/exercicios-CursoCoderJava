package Collections;

import java.util.HashSet;
import java.util.Set;

/** Set = pode ser heterogêneo - não é muito correto usar assim
 * pode ser homogêneo
 * não aceita ojb duplicados
 * pode ser ordenado
 * não é indexado
 *
 */

public class CollectionsSet {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // ele converte todos para o primitivo: double --> Double
        conjunto.add(true); // boolean --> Boolean
        conjunto.add("Testando"); // String

        System.out.println("Tamanho" + conjunto.size()); // mostra o tamanho da list
        conjunto.add("Testando"); // não aceita repetição de ítens
        System.out.println("Tamanho" + conjunto.size());

        System.out.println(conjunto.remove("Testando")); //se encontrar o elemento "Testando" ele retorna true
        System.out.println(conjunto.contains(1.2)); // retorna true pq tem o valor dentro do conjunto

        HashSet conjunto2 = new HashSet();
        conjunto2.add(5);
        conjunto2.add(false);

        System.out.println(conjunto);
        System.out.println(conjunto2);
        conjunto.add(conjunto2);
        System.out.println(conjunto);
        conjunto.retainAll(conjunto2); // retain tudo que se repete nos 2 conjuntos
        System.out.println(conjunto);

    }

}
