package Exercicio07;

import java.util.Scanner;

public class OrdemInversa {
            public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o tamanho do array: ");
            int tamanho = entrada.nextInt();

            int[] numeros = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = entrada.nextInt();
            }

            int[] numerosInvertidos = invertido(numeros);

            System.out.println("Invertido:");

            for (int numero : numerosInvertidos) {
                System.out.println(numero);
            }
        }

        public static int[] invertido(int[] array) {
            int[] arrayInvertido = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayInvertido[i] = array[array.length - 1 - i];
            }

            return arrayInvertido;
        }
  }





