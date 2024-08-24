package exercicio16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrirLoja() {
        System.out.println(nome + " está agora aberta.");
    }

    public void fecharLoja() {
        System.out.println(nome + " está agora fechada.");
    }

}

