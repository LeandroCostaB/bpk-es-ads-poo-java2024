package exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Quantidade em estoque não pode ser negativa.");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println("Estoque aumentado. Quantidade atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Quantidade a aumentar deve ser positiva.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEstoque >= quantidade) {
                this.quantidadeEstoque -= quantidade;
                System.out.println("Estoque diminuído. Quantidade atual: " + this.quantidadeEstoque);
            } else {
                System.out.println("Quantidade insuficiente no estoque.");
            }
        } else {
            System.out.println("Quantidade a diminuir deve ser positiva.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}

