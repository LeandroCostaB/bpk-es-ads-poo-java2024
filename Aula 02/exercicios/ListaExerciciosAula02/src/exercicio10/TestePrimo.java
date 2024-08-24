package exercicio10;

import java.util.Scanner;

public class TestePrimo {
    public static void main(String[] args) {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        if (numeroPrimo.ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

