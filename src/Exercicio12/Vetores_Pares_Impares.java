package Exercicio12;

import java.util.Scanner;
public class Vetores_Pares_Impares {
           public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int tamanho = 20;
            int[] vetorA = new int[tamanho];
            int[] vetorB = new int[tamanho];
            int[] vetorC = new int[tamanho];
            int indiceB = 0;
            int indiceC = 0;

            // Ler os elementos do vetor A
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
                vetorA[i] = entrada.nextInt();
            }

            // Separar os valores pares e ímpares em vetores B e C
            for (int i = 0; i < tamanho; i++) {
                if (vetorA[i] % 2 == 0) {
                    vetorB[indiceB] = vetorA[i];
                    indiceB++;
                } else {
                    vetorC[indiceC] = vetorA[i];
                    indiceC++;
                }
            }

            // Exibir o vetor B (valores pares)
            System.out.println("Valores pares (vetor B):");
            for (int i = 0; i < indiceB; i++) {
                System.out.print(vetorB[i] + " ");
            }
            System.out.println();

            // Exibir o vetor C (valores ímpares)
            System.out.println("Valores ímpares (vetor C):");
            for (int i = 0; i < indiceC; i++) {
                System.out.print(vetorC[i] + " ");
            }
            System.out.println();
        }
}


