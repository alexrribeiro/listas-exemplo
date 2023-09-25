package Lista6.Lista6Exemplo2;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private int[] a = new int[15];
    private int[] b = new int[15];
    private int[] resposta = new int[15];

    private int[] recebeValoresVetor(int vetor[]) {
        for (int i = 0; i < 15; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    private void ordenaVetores() {
        Arrays.sort(a);
        Arrays.sort(b);
    }

    private void somaVetores() {
        for (int i = 0; i < 15; i++) {
            resposta[i] = a[i] + b[i];
        }
    }

    public void executaExemplo() {
        System.out.println("Recebendo valores de A:");
        recebeValoresVetor(a);
        System.out.println("Recebendo valores de B");
        recebeValoresVetor(b);
        ordenaVetores();
        somaVetores();
        System.out.println("Posição 10 do vetor resultado: " + resposta[10]);
    }
}
