package exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha("Italiana", 4, "Branca");

        minhaCozinha.cozinhar();
        minhaCozinha.limpar();
    }
}

