package Lista6.Lista6Exemplo6;

public class Exemplo {
    int[] a = new int[6];

    private void preencheVetor() {
        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;
    }

    private int somaPosicoesZeroUmCinco() {
        int soma = a[0] + a[1] + a[5];
        return soma;
    }

    private void modificaValorPosicaoQuatro() {
        a[4] = 100;
    }

    private void mostraValores() {
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }

    public void executaExemplo() {
        preencheVetor();
        System.out.println("Soma das posições A[0], A[1] e A[5] = " + somaPosicoesZeroUmCinco());
        modificaValorPosicaoQuatro();
        System.out.println("Valores do vetor:");
        mostraValores();
    }
}
