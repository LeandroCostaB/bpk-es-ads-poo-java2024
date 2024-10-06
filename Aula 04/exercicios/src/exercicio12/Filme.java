package exercicio12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        setTitulo(titulo);
        setDiretor(diretor);
        setDuracao(duracao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor == null || diretor.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do diretor não pode ser vazio.");
        }
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser um valor positivo.");
        }
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme " + titulo + " dirigido por " + diretor + " está sendo iniciado.");
    }

    public void parar() {
        System.out.println("O filme " + titulo + " foi parado.");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
