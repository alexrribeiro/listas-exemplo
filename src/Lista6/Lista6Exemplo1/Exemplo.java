package Lista6.Lista6Exemplo1;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[10];
    private int[] resposta = new int[10];

    private void recebeNumeros() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
    }

    private void ordenaVetor() {
        trocaSinal();
        Arrays.sort(vetor);
        trocaSinal();
    }

    private void trocaSinal() {
        for (int i = 0; i < 10; i++) {
            vetor[i] *= -1;
        }
    }

    private void mutliplicaVetor() {
        for (int i = 0; i < 10; i++) {
            resposta[i] = vetor[i] * 3;
        }
    }

    private void exibeDados() {
        for (int i = 0; i < 10; i++) {
            System.out.println(resposta[i]);
        }
    }

    public void processaExemplo() {
        recebeNumeros();
        ordenaVetor();
        mutliplicaVetor();
        exibeDados();
    }
}
