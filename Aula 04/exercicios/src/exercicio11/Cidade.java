package exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        setNome(nome);
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome da cidade não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        if (populacao < 0) {
            System.out.println("A população não pode ser negativa.");
        } else {
            this.populacao = populacao;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade a ser adicionada não pode ser negativa.");
        } else {
            this.populacao += quantidade;
            System.out.println("População aumentada. População atual: " + this.populacao);
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade a ser diminuída não pode ser negativa.");
        } else if (this.populacao >= quantidade) {
            this.populacao -= quantidade;
            System.out.println("População diminuída. População atual: " + this.populacao);
        } else {
            System.out.println("Quantidade insuficiente de população.");
        }
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
