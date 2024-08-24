package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Cachorro", 5, 10);

        meuAnimal.alimentar();
        meuAnimal.dormir();
    }
}

