package array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizSalaDeAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos na sala? ");
        int quantAlunos = entrada.nextInt();
        System.out.println("Quantas notas por aluno? ");
        int quantNotas = entrada.nextInt();
        double total =0;
        double[][] salaDeAula = new double[quantAlunos][quantNotas];
        for (int i = 0; i < salaDeAula.length ; i++) {
            for (int j = 0; j < salaDeAula[0].length; j++) {
                System.out.printf("Digite a %da nota do aluno %d: ", j + 1, i + 1);
                salaDeAula[i][j] = entrada.nextDouble();
                total += salaDeAula[i][j];

            }
        }
        System.out.println(Arrays.deepToString(salaDeAula));
        System.out.println("A média da sala é: " + total/(quantNotas*quantAlunos));
    }
}
