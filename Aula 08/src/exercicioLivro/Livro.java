package exercicioLivro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        int numero = paginas.size() + 1;
        Pagina pagina = new Pagina(numero, conteudo);
        paginas.add(pagina);
    }

    public void listarPaginas() {
        for (Pagina pagina : paginas) {
            System.out.println(pagina);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
