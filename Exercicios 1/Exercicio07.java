import java.util.Scanner;
public class Exercicio07{
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int cand1 = 0;
    int cand2 = 0;
    int cand3 = 0;
    int cand4 = 0;
    int nulo = 0;
    int branco = 0;
    int total = 1;
    boolean fim = false;
    while(fim == false){
      System.out.println("Insira seu voto para os candidatos de 1 a 4, 5 para branco e 6 para nulo, para finalizar a votação: ");
    int num = leitor.nextInt();
      if(num == 1){
        cand1 ++;
      }
      if(num == 2){
        cand2 ++;
      }
      if(num == 3){
        cand3 ++;
      }
      if(num == 4){
        cand4 ++;
      }
      if(num == 5){
        nulo ++;
      }
      if(num == 6){
        branco ++;
      }
      if(num == 0){
        fim = true;
      }
      if(num < 0 || num > 6){
        System.out.println("Insira um número valido");
      }
    }   
    total = cand1 + cand2 + cand3 + cand4 + nulo + branco;
    float votos1 = (cand1 * 100)/total;
    float votos2 = (cand2 * 100)/total;
    float votos3 = (cand3 * 100)/total;
    float votos4 = (cand4 * 100)/total;
    float votosNulo = (nulo * 100)/total;
    float votosBranco = (branco * 100)/total;
    System.out.println(votos1 + "% dos votos foram para o candidato 1");
    System.out.println(votos2 + "% dos votos foram para o candidato 2");
    System.out.println(votos3 + "% dos votos foram para o candidato 3");
    System.out.println(votos4 + "% dos votos foram para o candidato 4");
    System.out.println(votosNulo + "% dos votos foram nulos");
    System.out.println(votosBranco + "% dos votos foram em branco");    
  }
}