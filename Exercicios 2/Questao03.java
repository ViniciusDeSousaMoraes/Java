import java.util.Scanner;
import java.util.Arrays;
public class Questao03{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int vetor[] = new int[16];

    int nVetor = 0;
    
    for(int i = 0; i < vetor.length; i++){
      System.out.println("Nome um numero para a " + nVetor + " posição no vetor:");
      int n = leitor.nextInt();
      vetor[i] = n;
      nVetor++;
    }
    
    int vetorEspelho[] = new int [8];
    
    for(int i = 0; i < vetorEspelho.length; i++){
      vetorEspelho[i] = vetor[i];
    }
    
    for(int i = 0; i < 8; i++){
      vetor[i] = vetor[i + 8];
    }

    for(int i = 0; i < 8; i++){
      vetor[i+8] = vetorEspelho[i];
    }
   
    for(int i = 0; i < vetor.length; i++){
      System.out.print(vetor[i] + " ");
    }
    
  }
}