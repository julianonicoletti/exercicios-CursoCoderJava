package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calculo = (x, y) -> {return x + y; };

        System.out.println(calculo.executar(2, 3));

        Calculo calculo1 = (x, y) ->{return x*y;};

        System.out.println(calculo1.executar(4,5));

        Calculo calculo2 = (x, y) -> {return (x*y)/10 + 100;};

        System.out.println(calculo2.executar(20, 30));

        calculo2 = (x, y) -> (x*y)+x/10+(1000);

        System.out.println(calculo2.executar(100, 160));





    }
}
