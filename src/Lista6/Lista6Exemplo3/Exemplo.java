package Lista6.Lista6Exemplo3;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private int[] a = new int[8];
    private int[] b = new int[8];
    private int[] c = new int[8];
    private int[] resposta = new int[8];

    private int[] recebeValores(int[] vetor, String letra) {
        System.out.println("Recebendo " + letra);
        for (int i = 0; i < 8; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    private int[] somaValores() {
        for (int i = 0; i < 8; i++) {
            resposta[i] = a[i] + b[i] + c[i];
        }
        return resposta;
    }

    public void executaExemplo() {
        recebeValores(a, "A");
        recebeValores(b, "B");
        recebeValores(c, "C");
        somaValores();
        System.out.println("Soma dos valores na posição 4: " + resposta[4]);
    }
}
