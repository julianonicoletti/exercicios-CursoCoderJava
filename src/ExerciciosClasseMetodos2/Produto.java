package ExerciciosClasseMetodos2;
import java.util.Scanner;

public class Produto {
 private String nome;
 private double precoCusto, precoVenda, margemLucro;
  public double getPrecoCusto() {
  return precoCusto; }

 public void setPrecoCusto(double precoCusto) {
  this.precoCusto = precoCusto; }

 public double getPrecoVenda() {
  return precoVenda; }

 public void setPrecoVenda(double precoVenda) {
  Scanner scanner = new Scanner(System.in);
  while(precoVenda<this.precoCusto) {
   System.out.println("ERRO!!! Preço de venda menor que Preço de custo");
   System.out.println("Digite um novo valor para a venda do Produto: ");
   precoVenda = scanner.nextDouble();
  }
  this.precoVenda = precoVenda; }

 public double getMargemLucro() {
  return margemLucro; }

 public void setMargemLucro(double margemLucro) {
  this.margemLucro = margemLucro; }
 public void calcularMargemLucro() {
  this.margemLucro = this.precoVenda - this.precoCusto;
 }
 public double calcularMargemLucroPorcentagem() {
  return (this.margemLucro/this.precoCusto)*100;
 }

}




