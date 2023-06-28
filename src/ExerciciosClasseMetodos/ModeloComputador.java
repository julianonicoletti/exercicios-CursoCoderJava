package ExerciciosClasseMetodos;

public class ModeloComputador {
    double placaMae = 800.00;
    int processador;
    int memoria;
    int hd;
    int monitor;

    ModeloComputador(int processador, int memoria, int hd, int monitor) {
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
    }

    public double calculaPreco() {
        double precoTotal = 800;
        switch (this.processador) {
            case 600 -> {
                precoTotal += 700;
                break;
            }
            case 800 -> {
                precoTotal += 830;
                break;
            }
            case 933 -> {
                precoTotal += 910;
                break;
            }
        }
        switch (this.hd) {
            case 20: {
                precoTotal += 300;
                break;
            }
            case 40: {
                precoTotal += 420;
                break;
            }
            case 60: {
                precoTotal += 500;
                break;
            }
        }
        switch (this.monitor) {
            case 15: {
                precoTotal += 320;
                break;
            }
            case 17: {
                precoTotal += 520;
                break;
            }
        }
        return precoTotal += (350 * (float) (this.memoria / 128));

    }
}
