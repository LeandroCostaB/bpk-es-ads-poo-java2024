package exercicio11;

import java.util.Scanner;

public class TestePalindromo {
    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = scanner.nextLine();

        if (palindromo.ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}

