import java.io.IOException;
import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);

        int contagem = entrada.nextInt();
        int nota;
        int cont = 0;

        for(int i=0; i<contagem; i++){
            nota = entrada.nextInt();

            if(nota >= 50){
                cont++;
            }
        }

        System.out.println("Número de alunos que passaram no exame: "+cont);
        
    }
}
