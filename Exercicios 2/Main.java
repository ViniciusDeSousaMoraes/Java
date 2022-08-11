import java.util.Scanner;

//Questão 01
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um número para A: ");
    int numA = leitor.nextInt();
    System.out.println("Digite um número para N: ");
    int numN = leitor.nextInt();
    System.out.println("A soma desses númers é: "+Soma(numA,numN));
  }
  
  public static int Soma(int numA, int numN){
    int result;
    if(numN <= 0){
      result = -1;
      return result;
    }else{
      result = numA + numN;
      return result;
    }
    
  }
}
