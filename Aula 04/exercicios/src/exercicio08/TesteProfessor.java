package exercicio08;

class TesteProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Jhoni", "Java", 100000000);

        System.out.println(professor);

        professor.darAula();
        professor.corrigirProvas();

        professor.setSalario(-5000);

        professor.setSalario(80000);
        System.out.println("Salário atualizado: " + professor.getSalario());
    }
}
