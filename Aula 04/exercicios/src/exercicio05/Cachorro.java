package exercicio05;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro() {
    }

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa.");
        } else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }
}
