package DesafioModulo5;

public class Pessoa {
    double pesoPessoa;
    String nomePessoa;

    Pessoa(double pesoPessoa, String nomePessoa) {
        this.pesoPessoa = pesoPessoa;
        this.nomePessoa = nomePessoa;
    }

    double comer(Comida comida) {
          return this.pesoPessoa + comida.pesoComida;
       }
}
