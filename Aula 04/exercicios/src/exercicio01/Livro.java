package exercicio01;

import java.util.Objects;

/**
 * 1 - Crie uma classe chamada Livro com atributos como titulo,
 * autor, e numeroDePaginas.
 * Adicione métodos para abrir o livro e ler uma página.
 */
public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroDePaginas;
    private Boolean aberto = false;
    private Integer paginaAtual = 1;
    private Boolean concluido = false;

    public Livro(String titulo, String autor, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        setNumeroDePaginas(numeroDePaginas);
    }

    public void abrirLivro(){
        this.aberto = true;
    }

    public void lerPagina(){
        if (aberto && !concluido) {
            if(paginaAtual.equals(numeroDePaginas)){
                concluido = true;
            } else {
                paginaAtual++;
            }
        } else if (!aberto) {
            System.out.println("O livro está fechado. Abra o livro primeiro.");
        } else {
            System.out.println("Você já terminou de ler o livro.");
        }
    }

    public Boolean livroAberto() {
        return aberto;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }

    public Boolean isConcluido() {
        return concluido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        if (numeroDePaginas <= 0) {
            System.out.println("O número de páginas deve ser maior que zero.");
        } else {
            this.numeroDePaginas = numeroDePaginas;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", paginaAtual=" + paginaAtual +
                ", concluido=" + concluido +
                ", aberto=" + aberto +
                '}';
    }
}
