package exercicio08;

import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Insira sua idade: ");
        idade = scanner.nextInt();
    }

    public void imprimirMensagem() {
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}

