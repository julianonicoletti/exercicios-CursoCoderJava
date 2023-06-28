package fundamentos;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro salário: ");
        String salario1 = scanner.nextLine().replace(",", ".");

        System.out.println("Digite o valor do segundo salário: ");
        String salario2 = scanner.nextLine().replace(",", ".");

        System.out.println("Digite o valor do terceiro salário: ");
        String salario3 = scanner.nextLine().replace(",", ".");
        /*salario1 = salario1.replaceAll(",",".");
        salario2 = salario2.replaceAll(",", ".");
        salario3 = salario3.replaceAll(",", ".");
*/
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        System.out.printf("""
                Primeiro salário digitado: %.2f\s
                Segundo salário digitado: %.2f\s
                Terceiro salário digitado: %.2f
                E a média dos 3 é %.2f:\s""", valor1, valor2, valor3, ((valor1+valor2+valor3)/3));










    }


}
