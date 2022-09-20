import java.io.IOException;
import java.util.Scanner;

// Somatório: Soma de um conjunto de números.

public class Somatorio {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int repetir = entrada.nextInt();
      int soma = 0;
      int i = 0;
      
      while(i<repetir){
        int valores = entrada.nextInt();
        soma = soma + valores;
        i = i+1;
      }

      System.out.println("A soma dos "+repetir+" números é "+soma);
      
      entrada.close();
    }
 
}