package Exercicio11;

import java.util.Scanner;
public class Vetro_Posicao {
    public static void main(String[] args) {

        int tamanho = 10;
        int[] vetorA = new int[tamanho];
        Scanner entrada = new Scanner(System.in);

        // Ler as idades do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            vetorA[i] = entrada.nextInt();
        }

        int menorIdade = vetorA[0];
        int posicaoMenorIdade = 0;
        int maiorIdade = vetorA[0];
        int posicaoMaiorIdade = 0;

        // Encontrar a menor e a maior idade e suas respectivas posições
        for (int i = 1; i < tamanho; i++) {
            if (vetorA[i] < menorIdade) {
                menorIdade = vetorA[i];
                posicaoMenorIdade = i;
            }

            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
                posicaoMaiorIdade = i;
            }
        }

        System.out.println("A menor idade é " + menorIdade + " e sua posição no vetor é " + posicaoMenorIdade);
        System.out.println("A maior idade é " + maiorIdade + " e sua posição no vetor é " + posicaoMaiorIdade);
    }
}


