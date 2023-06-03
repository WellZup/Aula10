package Exercicio06;

import java.util.Scanner;

public class Multiplos5_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos números para verificação: ");
        int qtNumeros = entrada.nextInt();

        int[] numeros = new int[qtNumeros];
        for (int i = 0; i < qtNumeros; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int numero: numeros) {
            boolean multiploDe5 = numero % 5 == 0;
            boolean multiploDe7 = numero % 7 == 0;

            if (multiploDe5 && multiploDe7) {
                System.out.println(numero + " é múltiplo de 5 e 7.");
            } else {
                System.out.println(numero + " não é múltiplo de 5 e 7.");
            }
        }

        }
 }

