package Exercicio03;

import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[2];

        //Digitar os números para verificar e colocar em ordem decrescente
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números em ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }


    }

    }

//        System.out.println("Digite o 1° numero: ");
//        int numero1 = entrada.nextInt();
//
//        System.out.println("Digite o 2° numero: ");
//        int numero2 = entrada.nextInt();
//
//        if (numero1 > numero2){
//            System.out.println();
//        }



