package exercicio19;

class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital meuLivro = new LivroDigital("Java para Iniciantes", "Jhoni", 10);

        meuLivro.abrirLivro();
        meuLivro.fecharLivro();
    }
}

