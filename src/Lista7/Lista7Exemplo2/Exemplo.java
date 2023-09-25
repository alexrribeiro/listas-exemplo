package Lista7.Lista7Exemplo2;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    private String vetor[] = new String[10];
    private String vetorInverso[] = new String[10];

    private void preencherVetor() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento: ");
            vetor[i] = sc.nextLine();
        }
    }

    private void inverterVetor() {
        int j = 9;
        for (int i = 0; i < 10; i++) {
            vetorInverso[j] = vetor[i];
            j--;
        }
    }

    private void exibirVetores() {
        System.out.println("Exibindo o vetor normal:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Exibindo o vetor inverso:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorInverso[i]);
        }
    }

    public void executar() {
        preencherVetor();
        inverterVetor();
        exibirVetores();
    }
}
