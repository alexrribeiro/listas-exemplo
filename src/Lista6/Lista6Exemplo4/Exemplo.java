package Lista6.Lista6Exemplo4;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private int[] a = new int[8];
    private int[] b = new int[8];
    private int[] c = new int[8];

    private void recebeDados(int[] vetor) {
        for (int i = 0; i < 8; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
    }

    private void subtraiVetores() {
        for (int i = 0; i < 8; i++) {
            c[i] = a[i] - b[i];
        }
    }

    public void executaExemplo() {
        System.out.println("Recebendo A");
        recebeDados(a);
        System.out.println("Recebendo B");
        recebeDados(b);
        subtraiVetores();
        System.out.println("Resultado na posição 7: " + c[7]);
    }
}
