package exercicio07;

class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("JavaMan", "12345", "JavaParaLoucos");

        double[] notas = {5.0, 7.5, 3.0, 6.5};
        for (double nota : notas) {
            aluno.adicionarNota(nota);
        }

        System.out.println("A média das notas é: " + aluno.calcularMedia());
    }
}
