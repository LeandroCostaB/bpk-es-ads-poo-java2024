package exercicio03;

import java.util.Scanner;

class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
