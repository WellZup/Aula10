package Exercicio04;

public class Calcular_Altura_e_Sexo {
    public static void main(String[] args) {
        String[] sexo = {"M", "F", "M", "F","M", "F","M", "F","M", "F", };
        double[] altura = {1.75, 1.65, 1.80, 1.60, 1.55, 1.85, 1.70, 1.60, 1.80, 1.65};

        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        double somaAlturasHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        //Descobrir a altura se é maior ou menor
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        //Descobrir a quantidade de mulheres e media da altura dos homens
            if (sexo[i].equals("M")) {
                somaAlturasHomens += altura[i];
                quantidadeHomens++;
            } else if (sexo[i].equals("F")) {
                quantidadeMulheres++;
            }
        }

        double mediaAlturasHomens = somaAlturasHomens / quantidadeHomens;

        System.out.println("Maior altura: " + maiorAltura + " metros");
        System.out.println("Menor altura: " + menorAltura + " metros");
        System.out.println("Média de altura dos homens: " + mediaAlturasHomens + " metros");
        System.out.println("Número de mulheres: " + quantidadeMulheres);


 }

}
