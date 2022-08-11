import java.util.Scanner;
public class Exercicio03{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número para L: ");
    float numL = leitor.nextFloat();
    float areaQ = numL * 2;
    System.out.println("Digite um número para R: ");
    float numR = leitor.nextFloat();
    float areaR = 3.14f * (numR * numR);
    if(areaQ > areaR){
      System.out.println("O maior é o Quadrado, com área de: " + areaQ);
    }
    if(areaQ < areaR){
      System.out.println("O maior é o Circulo, com área de: " + areaR);
    }
  }
}