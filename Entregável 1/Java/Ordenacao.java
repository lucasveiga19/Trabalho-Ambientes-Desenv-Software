import java.io.IOException;

// Ordenação: Ordenar um array usando o método Quicksort.

public class Ordenacao {
 
    public static void main(String[] args) throws IOException {
      int items[] = {5,3,7,6,2,9};
      
      ordenarVetorDeInteiros(items);
      imprimirVetor(items);
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor...\n");
        for(int num : vetor) {
            System.out.print(num + ", ");
        }
    }

  public static void ordenarVetorDeInteiros(int[] vetor) {
    quickSort(vetor, 0, vetor.length - 1);
  }

  private static void quickSort(int[] vetor, int inicio, int fim) {
    if(fim > inicio) {
        int indexPivo = dividir(vetor, inicio, fim);
        quickSort(vetor, inicio, indexPivo - 1);
        quickSort(vetor, indexPivo + 1, fim);
    }
  }

  private static int dividir(int[] vetor, int inicio, int fim) {
    int pivo, pontEsq, pontDir = fim;
    pontEsq = inicio + 1;
    pivo = vetor[inicio];

    while(pontEsq <= pontDir) {
      while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
        pontEsq++;
      }

      while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
        pontDir--;
      }

      if(pontEsq < pontDir) {
        trocar(vetor, pontDir, pontEsq);
        pontEsq++;
        pontDir--;
      }
    }

    trocar(vetor, inicio, pontDir);
    return pontDir;
  }
  
  private static void trocar(int[] vetor, int i, int j) {
    int temp = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = temp;
  }
}
