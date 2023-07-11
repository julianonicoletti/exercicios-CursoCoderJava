package Collections;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Crie um programa Java que armazene uma lista de números inteiros. O
 * programa deve realizar as seguintes tarefas:
 *
 * Crie uma lista vazia chamada "numeros" que irá armazenar os números inteiros.
 * Peça ao usuário para digitar 5 números inteiros e adicione-os à lista.
 * Imprima a lista de números na ordem em que foram inseridos.
 * Ordene a lista em ordem crescente.
 * Imprima a lista ordenada.
 * Verifique se um determinado número fornecido pelo usuário está presente
 * na lista. Se estiver, imprima "O número está presente na lista";
 * caso contrário, imprima "O número não está presente na lista".
 * Calcule e imprima a soma de todos os números na lista.
 * Remova os números pares da lista.
 * Imprima a lista final resultante.
 */

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
