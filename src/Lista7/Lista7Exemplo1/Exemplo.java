package Lista7.Lista7Exemplo1;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[10];

    private void preencherVetor() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
    }

    private void exibirVetor() {
        System.out.println("Exibindo vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }

    private void exibirVetorInvertido() {
        System.out.println("Exibindo vetor invertido");
        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }

    public void executar() {
        preencherVetor();
        exibirVetor();
        exibirVetorInvertido();
    }
}
