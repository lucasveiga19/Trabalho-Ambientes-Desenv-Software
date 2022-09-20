import java.io.IOException;
import java.util.Scanner;

// Fibonacci: onde N > 1. Os primeiros termos são: 0, 1, 1, 2, 3, 5, 8, 13 …. Cada termo, além dos dois primeiros, é derivado da soma de seus dois antecessores mais próximos.

public class Fibonacci {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int repetir = entrada.nextInt();
      int termo1 = 0;
      int termo2 = 1;
      int termo3;
      
      System.out.print(termo1+", "+termo2);

      for(int i=3; i<=repetir; i++){
        termo3 = termo1+termo2;
        System.out.print(", "+termo3);
        termo1 = termo2;
        termo2 = termo3;
      }

      entrada.close();
    }
 
}