import java.util.Scanner;
public class Exercicio02{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int count = 1;
    System.out.println("Digite um número: ");
    int numTres = leitor.nextInt();
    int numDois = numTres;
    while(count <= 2){
      System.out.println("Digite um número: ");
      int num = leitor.nextInt();
      if(num <= numDois){
        count ++;
      }
      if(num > numDois){
        numDois = num;
        count ++;
      }  
    }
    System.out.println("O maior numero dos três selecionados é: " + numDois);
  }
}