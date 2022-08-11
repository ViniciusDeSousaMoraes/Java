import java.util.Scanner;
public class Exercicio01{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Nome do funcionario: ");
    String nome = leitor.next();
    System.out.println("Qual o valor do salário deste funcionário? ");
    int salario = leitor.nextInt();
    System.out.println("Qual o valor total em vendas arrecadado pelo vendedor? ");
    int vendas = leitor.nextInt();
    float vendasFinal = vendas * 0.15f;
    float salarioFinal = salario + vendasFinal;
    System.out.println("O salário de " + nome + "é de: " + salarioFinal);
  }
}