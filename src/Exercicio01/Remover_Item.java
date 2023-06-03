package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Remover_Item {

    public static void main(String[] args) {
        List<Integer> ListaItem = new ArrayList<>();
        ListaItem.add(1);
        ListaItem.add(2);
        ListaItem.add(3);
        ListaItem.add(4);
        ListaItem.add(5);
        ListaItem.add(6);

        System.out.println("Minha lista de números " + ListaItem);

        ListaItem.remove(0);

        System.out.println("Minha lista de números depois " + ListaItem);

    }
}
