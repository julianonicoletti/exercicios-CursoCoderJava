package oo.DesafiosInternet.Agenda;

import java.util.ArrayList;
import java.util.zip.ZipFile;

public class Pessoas {
    private String nome;
    private int idade;
    private float altura;
    static ArrayList<Pessoas> pessoa = new ArrayList<>();

    public Pessoas(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoas() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public ArrayList<Pessoas> getPessoas() {
        return pessoa;
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        pessoa.add(new Pessoas(nome, idade, altura));

    }

    public void removerPessoa(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < pessoa.size(); i++) {
            Pessoas pessoaAtual = pessoa.get(i);
            if (pessoaAtual.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome Encontrado!!!");
                System.out.println("Posição No. " + i);
                System.out.println("Pessoa Removida com sucesso!!");
                pessoa.remove(pessoaAtual);
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("Nome não encontrado!!");
        }
    }
    public void buscarPessoa(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < pessoa.size(); i++) {
            Pessoas pessoaAtual = pessoa.get(i);
            if (pessoaAtual.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome Encontrado!!!");
                System.out.println("Posição No. " + i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("Nome não encontrado!!");
            }
    }

    /*public void imprimirPessoa() {
        for (int i = 0; i < pessoa.size(); i++) {
            Pessoas pessoaAtual = pessoa.get(i);
            System.out.println("---------------------------------------------");
            System.out.println("Índice" + i);
            System.out.println("Nome:" + pessoaAtual.getNome());
            System.out.println("Idade: " + pessoaAtual.getIdade());
            System.out.println("Altura: " + pessoaAtual.getAltura());
            System.out.println("---------------------------------------------");
        }
    }*/

    public void imprimirPessoa() {
        pessoa.forEach(pessoas -> System.out.println("Nome: " + pessoas.getNome() +
        "\nIdade: " + pessoas.getIdade() + "\nAltura: " + pessoas.getAltura()));


    }

    public void imprimirPessoa (int indice) {
        int indiceMax = pessoa.size() -1 ;
        if (pessoa.size() > indice) {
            System.out.println("---------------------------------------------");
            System.out.println("Nome:" + pessoa.get(indice).getNome());
            System.out.println("Idade: " + pessoa.get(indice).getIdade());
            System.out.println("Altura: " + pessoa.get(indice).getAltura());
            System.out.println("---------------------------------------------");

        } else {
            System.out.println("Valor digitado está fora do alcande da lista");
            System.out.println("Digite um valor entre 0 e " + indiceMax);
        }
    }
}
