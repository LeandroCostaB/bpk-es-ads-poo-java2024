package exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println("Estoque aumentado. Quantidade atual: " + this.quantidadeEstoque);
    }

    public void diminuirEstoque(int quantidade) {
        if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuído. Quantidade atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }
}

