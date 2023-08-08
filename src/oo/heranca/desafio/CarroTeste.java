package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.velocidadeAtual = 150;
        Ferrari ferrari = new Ferrari();
        ferrari.velocidadeAtual = 180;

        Carro ferrari2 = new Ferrari();
        ferrari2.velocidadeAtual = 150;
        ferrari2.acelerar();


        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(civic.velocidadeAtual);
        System.out.println(ferrari.velocidadeAtual);
        System.out.println(ferrari2.velocidadeAtual);


    }
}
