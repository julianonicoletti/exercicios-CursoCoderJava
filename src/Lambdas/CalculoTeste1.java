package Lambdas;
public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multiplicar = new Multiplicar();
        System.out.println(soma.executar(2, 5));
        System.out.println(multiplicar.executar(4,5));

        Calculo calculo = new Soma();
        System.out.println(calculo.executar(5, 10));
        calculo = new Multiplicar();
        System.out.println(calculo.executar(5,10));


    }

}
