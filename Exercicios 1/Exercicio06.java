import java.util.Scanner;
public class Exercicio06{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Selecione o primeiro número: ");
    int num = leitor.nextInt();
    System.out.println("Selecione o segundo número: ");
    int poten = leitor.nextInt();
    int count = 1;
    int result = num;
    while(count != poten){
      result = result * num;
      count ++;
    }
    System.out.println("O resultado da operação " + num + "^" + poten + " é: " + result);    
  }
}