package exercicio07;

class AlunoTeste {
    public static void main(String[] args) {
        double[] notas = {5.0, 7.5, 3.0, 6.5};
        Aluno aluno = new Aluno("JavaMan", "12345", "JavaParaLoucos", notas);
        System.out.println("A média das notas é: " + aluno.calcularMedia());
    }
}

