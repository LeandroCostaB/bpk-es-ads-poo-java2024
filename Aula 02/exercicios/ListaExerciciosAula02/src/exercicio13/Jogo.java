package exercicio13;

import java.util.Random;
import java.util.Scanner;

class JogoAdivinhacao {
    public void jogar() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe o número (entre 1 e 100): ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa > numeroAleatorio) {
                System.out.println("Muito alto!");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo!");
            }
        } while (tentativa != numeroAleatorio);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}

