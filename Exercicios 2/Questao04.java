import java.util.Scanner;
import java.util.Arrays;
public class Questao04{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int vetor[] = new int[6];

    int nVetor = 0;

    boolean palin = true;
    
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Nome um numero para a " + nVetor + " posição no vetor:");
      int n = leitor.nextInt();
      vetor[i] = n;
      nVetor++;
    }
    for(int f = 0; f < (vetor.length)/2; f++){
      if(vetor[f] == vetor[vetor.length - f - 1] && palin != false){
        palin = true;
      }
      if(vetor[f] != vetor[vetor.length - f - 1] || palin == false){
        palin = false;
      }
    }
    System.out.print("Boolean para palíndromo: " + palin); 
  }
}
//Não entendi o erro que deu...