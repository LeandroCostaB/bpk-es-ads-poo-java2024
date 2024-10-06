package exercicio03;

/**
 * 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura.
 * Adicione um método que imprime uma apresentação da pessoa.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("A idade não pode ser negativa.");
        } else {
            this.idade = idade;
        }
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("A altura deve ser maior que zero.");
        } else {
            this.altura = altura;
        }
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
