package exercicio15;

class JogoTeste {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 15);
        jogo.iniciar();
        jogo.pausar();
    }
}

