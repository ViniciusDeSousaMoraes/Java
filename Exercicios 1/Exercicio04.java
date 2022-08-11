import java.util.Scanner;
public class Exercicio04{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Insira a idade do nadador: ");
    int idade = leitor.nextInt();
    if(idade <= 4){
      System.out.println("O nadador não pode ser classificado em nenhuma categoria");
    }
    if(5 <= idade && idade <= 7){
      System.out.println("O nadador pode ser classificado na categoria: Infantil A");
    }
    if(8 <= idade && idade <= 10){
      System.out.println("O nadador pode ser classificado na categoria: Infantil B");
    }
    if(11 <= idade && idade <= 13){
      System.out.println("O nadador pode ser classificado na categoria: Juvenil A");
    }
    if(14 <= idade && idade <= 17){
      System.out.println("O nadador pode ser classificado na categoria: Juvenil B");
    }
    if(18 <= idade){
      System.out.println("O nadador pode ser classificado na categoria: Adulto");
    }   
  }
}