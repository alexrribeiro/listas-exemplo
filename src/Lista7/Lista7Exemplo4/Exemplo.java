package Lista7.Lista7Exemplo4;

import java.util.Scanner;

public class Exemplo {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[15];

    private void receberNumeros() {
        for (int i = 0; i < 15; i++) {
            System.out.print("Numero: ");
            vetor[i] = sc.nextInt();
        }
    }

    private int verificarMenoresOuIguaisA10() {
        int menoresOuIguaisA10 = 0;
        for (int i = 0; i < 15; i++) {
            if (vetor[i] <= 10) menoresOuIguaisA10++;
        }
        return menoresOuIguaisA10;
    }

    private int verificarMaioresOuIguaisA10() {
        int maioresOuIguaisA10 = 0;
        for (int i = 0; i < 15; i++) {
            if (vetor[i] >= 10) maioresOuIguaisA10++;
        }
        return maioresOuIguaisA10;
    }

    public void executar() {
        receberNumeros();
        System.out.println("Menores ou iguais a 10: " + verificarMenoresOuIguaisA10());
        System.out.println("Maiores ou iguais a 10: " + verificarMaioresOuIguaisA10());
    }
}
