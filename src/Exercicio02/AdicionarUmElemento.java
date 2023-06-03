package Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarUmElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> ListaItem = new ArrayList<>();

        ListaItem.add(1);
        ListaItem.add(2);
        ListaItem.add(3);
        ListaItem.add(4);
        ListaItem.add(5);

        System.out.println("Lista de números inicial \n" + ListaItem);

        System.out.println("Novo número para ser colocado ");
        int item = entrada.nextInt();

        System.out.println("Qual posição do novo número ");
        int posicao = entrada.nextInt();

        if(posicao >= 0 && posicao <= item){
            ListaItem.add(posicao, item);
            System.out.println("Número adicionada!");
            System.out.println("Nova lista de números: " + ListaItem);
        } else{
            System.out.println("Posição invalida!");
        }
    }

}
