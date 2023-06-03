package Exercicio10;

import java.util.Scanner;
public class Vetor_Media {

        public static void main(String[] args) {
            int tamanho = 10;
            int[] vetorA = new int[tamanho];
            Scanner entrada = new Scanner(System.in);

            // Ler os elementos do vetor
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o elemento " + (i + 1) + ": ");
                vetorA[i] = entrada.nextInt();
            }

            // Calcular a média dos elementos ímpares
            int soma = 0;
            int quantidadeImpares = 0;

            for (int i = 0; i < tamanho; i++) {
                if (vetorA[i] % 2 != 0) {
                    soma += vetorA[i];
                    quantidadeImpares++;
                }
            }

            double media = (double) soma / quantidadeImpares;

            System.out.println("A média dos elementos ímpares é: " + media);
        }
}


