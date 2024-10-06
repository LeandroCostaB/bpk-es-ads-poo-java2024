package exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private List<Double> notas;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        setMatricula(matricula);
        this.curso = curso;
        this.notas = new ArrayList<Double>();
    }

    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(Double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        } else {
            notas.add(nota);
        }
    }

    public void removerNota(int index) {
        if (index >= 0 && index < notas.size()) {
            notas.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            System.out.println("Matrícula não pode ser nula ou vazia.");
        } else {
            this.matricula = matricula;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
