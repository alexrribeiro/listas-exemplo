package Lista7.Lista7Exemplo3;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];

    private void receberValores() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
    }

    private void exibirMaioresQueAReferencia(int referencia) {
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > referencia) {
                System.out.println(vetor[i]);
            }
        }
    }

    private int retornarMenoresQueAReferencia(int referencia) {
        int menorQueReferencia = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < referencia) {
                menorQueReferencia++;
            }
        }
        return menorQueReferencia;
    }

    private int retornarIgualAReferencia(int referencia) {
        int igualAReferencia = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == referencia) {
                igualAReferencia++;
            }
        }
        return igualAReferencia;
    }

    public void executar() {
        int referencia;
        receberValores();
        System.out.println("Digite um número de referência: ");
        referencia = sc.nextInt();
        System.out.println("Exibindo números maiores que a referência: ");
        exibirMaioresQueAReferencia(referencia);
        System.out.println("Menores que a referência: " + retornarMenoresQueAReferencia(referencia));
        System.out.println("O valor de referência aparece " + retornarIgualAReferencia(referencia) + " vezes.");
    }
}
