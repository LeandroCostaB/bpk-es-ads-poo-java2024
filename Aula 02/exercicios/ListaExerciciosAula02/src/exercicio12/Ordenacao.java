package exercicio12;

import java.util.Arrays;
import java.util.Scanner;

class OrdenacaoNumeros {
    public void ordenarNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }
}

