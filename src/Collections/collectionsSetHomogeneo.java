package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class collectionsSetHomogeneo {
    public static void main(String[] args) {
        //HashSet<String> lista = new HashSet<>(); //cria um tipo específico
        TreeSet<String> lista = new TreeSet<>(); //treeset ordena a lista
        lista.add("teste");
        lista.add("Ana");
        lista.add("Cinthia");
        lista.add("Juliano");

        for (String candidato: lista) {
            System.out.println(candidato);
        }

        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(43);
        nums.add(120);
        nums.add(5);

        for (int n: nums) {
            System.out.println(n);
        }
        System.out.println(nums);
    }
}
