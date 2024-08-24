package exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        this.populacao += quantidade;
        System.out.println("População aumentada. População atual: " + this.populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        if (this.populacao >= quantidade) {
            this.populacao -= quantidade;
            System.out.println("População diminuída. População atual: " + this.populacao);
        } else {
            System.out.println("Quantidade insuficiente de população.");
        }
    }
}
