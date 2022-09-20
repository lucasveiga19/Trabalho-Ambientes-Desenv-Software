import java.io.IOException;
import java.util.Scanner;

// Máximo divisor comum: O máximo divisor comum (mdc) de dois inteiros a, b é o maior número inteiro que divide a e b.

public class MaxDivisorComum {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int a = entrada.nextInt();
      int b = entrada.nextInt();

      System.out.print("O MDC dos valores "+a+" e "+b+" é: ");

      while(b != 0){
        int r = a % b;
        a = b;
        b = r;
      }

      System.out.print(a);

      entrada.close();
    }
 
}