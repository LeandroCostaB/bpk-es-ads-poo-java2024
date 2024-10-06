package exercicio12;

class TesteFilme {
    public static void main(String[] args) {
        try {
            Filme filme = new Filme("O java", "Jhoni", 1000);

            System.out.println(filme);

            filme.iniciar();

            filme.parar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

