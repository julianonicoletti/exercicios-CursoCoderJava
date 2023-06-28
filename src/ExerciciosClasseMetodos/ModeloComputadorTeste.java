package ExerciciosClasseMetodos;

public class ModeloComputadorTeste {
    public static void main(String[] args) {
        ModeloComputador pc1 = new ModeloComputador(600, 512, 40, 15);
        System.out.printf("O preço total do PC com processador de %d Mhz \n" +
                        " e com %dmb de memória Ram, com disco rígido de %dGb \n" +
                        "e monitor de %d polegadas é %.2f",pc1.processador, pc1.memoria,
                pc1.hd, pc1.monitor, pc1.calculaPreco());
    }





}


