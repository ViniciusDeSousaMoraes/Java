import java.util.Scanner;
import java.util.Arrays;
public class Questao02{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int x[] = new int[10];
    int c = 0;
    int d = 0;
    int e = 0;
    while(c <= 9){
      System.out.println("Nome um numero para a " + c + " posição no vetor:");
      int n = leitor.nextInt();
      x[c] = n;
      c++;
    }
    for(int i = 0; i < x.length; i++){
      if(x[i] <= 0){
        x[i] = 1;
      }
    }
    while(d <= 9){
      System.out.print(x[d] + " ");
      d++;
    }
    
  }
}
