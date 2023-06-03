package Exercicio05;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Descobrir a quantidade de funcionário e salário
        System.out.println("Digite quantos funcionários tem na empresa: ");
        int qtfuncionarios = entrada.nextInt();

        double[] salarios = new double[qtfuncionarios];
        for (int i = 0; i < qtfuncionarios; i++){
        System.out.println("Digite o salário do " + (i+ 1) + ": ");
        salarios[i] = entrada.nextDouble();


        double somaSalario = 0;
            for ( double salario: salarios ) {
                somaSalario += salario;
            }

            double media = somaSalario / salarios.length;
            System.out.println("Média salária e de: " + media);
        }

    }

}


