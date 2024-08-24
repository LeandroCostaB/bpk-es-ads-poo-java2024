package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println("O professor " + nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println("O professor " + nome + " está corrigindo provas.");
    }
}

