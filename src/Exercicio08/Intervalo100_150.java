package Exercicio08;
import java.util.ArrayList;
import java.util.List;

public class Intervalo100_150 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 100; i <= 150; i++) {
            int somaDigitos = 0;
            int numero = i;

            while (numero != 0) {
                int digito = numero % 10;
                somaDigitos += digito;
                numero /= 10;
            }

            if (somaDigitos % 2 == 0) {
                numeros.add(i);
            }
        }

        System.out.println("Números cuja soma dos dígitos é par:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}



