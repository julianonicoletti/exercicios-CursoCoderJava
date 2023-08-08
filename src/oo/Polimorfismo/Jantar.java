package oo.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Comida ingrediente1 = new Arroz(0.250);
        Comida ingrediente2 = new Feijao(0.180);
        Comida ingrediente3 = new Sorvete(0.150);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(new Comida(0.500));
        System.out.println(convidado.getPeso());


    }
}
