package exercicio09;

import java.util.Scanner;

public class Calculadora {
    public void calcular() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: 1) Somar 2) Subtrair 3) Multiplicar 4) Dividir");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}

