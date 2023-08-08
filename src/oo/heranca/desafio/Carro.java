package oo.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    void acelerar () {
        velocidadeAtual += 5;
    }

    void freiar () {
        if(velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}

