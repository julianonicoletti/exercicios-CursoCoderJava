package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("teste"));

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.size());

        Set nums = new HashSet();
        nums.add(1);
        nums.add(23);

        System.out.println(nums);
        System.out.println(conjunto);
        conjunto.addAll(nums);
        System.out.println(conjunto);
        conjunto.add(nums);
        System.out.println(conjunto);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);




    }
}
