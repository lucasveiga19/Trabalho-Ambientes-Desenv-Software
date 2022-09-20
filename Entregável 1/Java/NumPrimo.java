import java.io.IOException;
import java.util.Scanner;

// Número é primo: Um número inteiro positivo n é primo se for divisível apenas por 1 e por n.

public class NumPrimo {
 
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);

      int repetir = entrada.nextInt();

      for(int i=0; i<repetir; i++){
        int validar = entrada.nextInt();
        int cont = 0;
        
        for(int j=2; j<validar; j++){
          if(validar%j==0){
            cont++;
          }
        }
        
        if(cont==0){
          System.out.println(validar+" eh primo");
        } else {
          System.out.println(validar+" nao eh primo");
        }
      }
      
      entrada.close();
    }
 
}