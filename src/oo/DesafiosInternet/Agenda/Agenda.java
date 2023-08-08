package oo.DesafiosInternet.Agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
         int escolha = -1;
        Scanner scanner = new Scanner(System.in);
        String tempNome;
        int tempIdade;
        float tempAltura;
        Pessoas pessoas = new Pessoas();

        do {
            System.out.println("*********APLICATIVO DE AGENDA*********");
            System.out.println("*********ESCOLHA UMA OPÇÃO**********");
            System.out.println("|1.| Incluir Pessoa");
            System.out.println("|2.| Excluir Pessoa");
            System.out.println("|3.| Buscar Pessoa");
            System.out.println("|4.| Imprimir Agenda");
            System.out.println("|5.| Imprimir Pessoa (Índice)");
            System.out.println("|6.| Sair");
            System.out.print("Digite uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();


        switch (escolha){
            case 1: {
                System.out.println("*****Inclusão no cadastro*****");
                System.out.println("Informe o nome:  ");
                tempNome = scanner.nextLine();
                System.out.println("Informe a idade:  ");
                tempIdade = scanner.nextInt();
                System.out.println("Informe a altura:  ");
                tempAltura = scanner.nextFloat();
                pessoas.armazenarPessoa(tempNome, tempIdade, tempAltura);
                break;
            }
            case 2: {
                System.out.println("*****Exclusão do cadastro*****");
                System.out.println("Digite o nome: ");
                tempNome = scanner.nextLine().toUpperCase();
                pessoas.removerPessoa(tempNome);
                break;
            }
            case 3: {
                System.out.println("*****Busca do cadastro*****");
                System.out.println("Digite o nome: ");
                tempNome = scanner.nextLine().toUpperCase();
                pessoas.buscarPessoa(tempNome);
                break;

            }
            case 4: {
                System.out.println("*****Imprimir Agenda*****");
                pessoas.imprimirPessoa();
                break;
            }
            case 5: {
                System.out.println("*****Imprimir Pessoa(Índice)*****");
                System.out.println("Digite o índice: ");
                int indice = scanner.nextInt();
                pessoas.imprimirPessoa(indice);
                break;
            }
        }
        }while(escolha!=6);
    }
}
