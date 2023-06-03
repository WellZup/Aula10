package Exercicio09;
import java.util.Scanner;
public class Matriz_Somar {
        public static void main(String[] args) {
            int linhas = 4;
            int colunas = 5;

            int[][] matriz = new int[linhas][colunas];
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite os elementos da matriz:");

            // Ler os elementos da matriz
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = entrada.nextInt();
                }
            }

            // Calcular a soma dos elementos
            int soma = 0;
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    soma += matriz[i][j];
                }
            }

            System.out.println("A soma dos elementos da matriz é: " + soma);
        }
}


