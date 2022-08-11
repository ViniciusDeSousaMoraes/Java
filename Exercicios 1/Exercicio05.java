import java.util.Scanner;
import java.lang.Math;
public class Exercicio05{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Selecione o primeiro número: ");
    float numA = leitor.nextFloat();
    System.out.println("Selecione o segundo número: ");
    float numB = leitor.nextFloat();
    System.out.println("Selecione o terceiro número: ");
    float numC = leitor.nextFloat();
    float ladoA = 0;
    float ladoB = 0;
    float ladoC = 0;

    if(numA > numB){
      if(numA > numC){
        ladoA = numA;
        if(numB > numC){
          ladoB = numB;
          ladoC = numC;
        }else{
          ladoB = numC;
          ladoC = numB;
        }
      }else{
        ladoA = numC;
        ladoB = numA;
        ladoC = numB;
      }    
    }else{
      if(numB > numC){
        ladoA = numB;
        if(numA > numC){
          ladoB = numA;
          ladoC = numC;
        }else{
          ladoB = numC;
          ladoC = numB;
        }
      }else{
        ladoA = numC;
        ladoB = numB;
        ladoC = numA;
      }
    }
    System.out.println("Lado A: " + ladoA);
    System.out.println("Lado B: " + ladoB);
    System.out.println("Lado C: " + ladoC);
    
    if(ladoA >= ladoB + ladoC){
      System.out.println("Não Forma triangulo.");
    }else{
      if(Math.pow(ladoA,2) == Math.pow(ladoB,2) + Math.pow(ladoC,2)){
        System.out.println("Triangulo retangulo");
      }
      if(Math.pow(ladoA,2) > Math.pow(ladoB,2) + Math.pow(ladoC,2)){
        System.out.println("Triangulo obtusangulo");
      }
      if(Math.pow(ladoA,2) < Math.pow(ladoB,2) + Math.pow(ladoC,2)){
        System.out.println("Triangulo acutangulo");
      }
      if(ladoA == ladoB && ladoB == ladoC){
        System.out.println("Triangulo equilatero");
      }
      if(ladoA == ladoB && ladoB != ladoC || ladoB == ladoC && ladoA != ladoB || ladoA == ladoC && ladoA != ladoB){
        System.out.println("Triangulo isoceles");
      }
    }   
  }
}