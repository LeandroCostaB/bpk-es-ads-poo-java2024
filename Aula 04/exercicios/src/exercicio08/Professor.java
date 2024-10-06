package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Salário não pode ser negativo.");
        } else {
            this.salario = salario;
        }
    }

    public void darAula() {
        System.out.println("O professor " + nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println("O professor " + nome + " está corrigindo provas.");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                '}';
    }
}
