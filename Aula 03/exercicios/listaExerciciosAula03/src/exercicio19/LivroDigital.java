package exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrirLivro() {
        System.out.println("O livro " + titulo + " foi aberto.");
    }

    public void fecharLivro() {
        System.out.println("O livro " + titulo + " foi fechado.");
    }

}

