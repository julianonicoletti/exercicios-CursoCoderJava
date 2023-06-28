package fundamentos;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {


    String valor = JOptionPane.showInputDialog("""
             |1| - INSERIR TODOS OS ELEMENTOS DO VETOR:\s
             |2| - MOSTRAR TODOS OS ELEMENTOS DO VETOR:
             |3| - BUSCAR ELEMENTOS PELO ÍNDICE:
             |4| - REMOVER UM ELEMENTO PELO ÍNDICE:
             |5| - BUSCAR UM NÚMERO DENTRO DO VETOR:
             |6| - CAlCULAR A MÉDIA DOS NÚMEROS DO VETOR:\s
             |7| - FINALIZAR O PROGRAMA:\
            """);

    int numero = Integer.parseInt(valor);



    }
}
