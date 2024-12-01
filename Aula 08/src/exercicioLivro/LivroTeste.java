package exercicioLivro;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("Aventuras de Java", "Jhoniman");

        livro.adicionarPagina("Capítulo 1: Introdução ao Java.");
        livro.adicionarPagina("Capítulo 2: Classes e Objetos.");
        livro.adicionarPagina("Capítulo 3: Herança e Polimorfismo.");

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas:");
        livro.listarPaginas();
    }
}

