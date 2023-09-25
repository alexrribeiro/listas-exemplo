package Lista6.Lista6Exemplo5;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    int[] notas = new int[15];
    double media;

    private void recebeNotas() {
        for (int i = 0; i < 15; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }
    }

    private double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < 15; i++) {
            soma += notas[i];
        }
        media = soma / 15;
        return media;
    }

    public void executaExemplo() {
        recebeNotas();
        System.out.println("Média final: " + calculaMedia());
    }
}
