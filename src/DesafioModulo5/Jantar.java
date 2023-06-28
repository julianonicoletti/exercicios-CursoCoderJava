package DesafioModulo5;
import java.util.Scanner;


public class Jantar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesocomida_temp, pesopessoa_temp;
        String nomecomida_temp, nomepessoa_temp;

        Comida c1 = new Comida(0.250, "feijao");
        Comida c2 = new Comida(0.250, "Arroz");
        Comida c3 = new Comida(0.350, "Frango");
        System.out.println("Digite o nome da comida: ");
        nomecomida_temp = scanner.nextLine();
        System.out.println("Digite o peso dessa comida: ");
        pesocomida_temp = scanner.nextDouble();
        Comida c4 = new Comida(pesocomida_temp, nomecomida_temp);
        scanner.nextLine();
        Pessoa p1 = new Pessoa(70.50, "Juliano Nicoletti");
        Pessoa p2 = new Pessoa(61.50, "Cinthia Kimura");
        System.out.println("Digite seu nome: ");
        nomepessoa_temp = scanner.nextLine();
        System.out.println("Digite seu peso atual: ");
        pesopessoa_temp = scanner.nextDouble();
        Pessoa p3 = new Pessoa(pesopessoa_temp, nomepessoa_temp);

        p1.comer(c1);
        System.out.printf("A pessoa %s tinha peso inicial de %.2f, " +
                "\ncomeu %.2f de %s e ficou com peso igual a %.2f",
                p3.nomePessoa, p3.pesoPessoa, c4.pesoComida, c4.nomeComida, p3.comer(c4));







    }
}
