package Collections;

import java.util.ArrayList;
import java.util.Scanner;
public class ExerciciosCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro:");
            numeros.add(scanner.nextInt());
        }

        for (int j = 0; j < numeros.size(); j++) {
            System.out.printf("\nPosição %d: %d", j, numeros.get(j));
        }

        numeros.sort(null);
        System.out.println("\nNumeros em ordem crescente: " + numeros);

        System.out.println("Escolha um número para verificar: ");
        int procurado = scanner.nextInt();
        if(numeros.contains(procurado)) {
            System.out.printf("\nO número %d está presente na lista " +
                    "na posição %d", procurado, numeros.indexOf(procurado) );
        } else System.out.printf("\nO número %d não está na lista", procurado);
        int somaTodos = 0;
        for (int k = 0; k < numeros.size(); k++) {
            somaTodos += numeros.get(k);
        }
        System.out.printf("\nA soma de todos os números é %d", somaTodos);

        numeros.removeIf(numero -> numero % 2 == 0);
        System.out.println("\nO array sem números pares ficou igual a: " + numeros);
    }


}
