package exercicio03;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fulano", 30, 1.85);

        System.out.println(pessoa);

        pessoa.setIdade(-5);
        pessoa.setIdade(25);
        System.out.println("Idade atualizada: " + pessoa.getIdade());


        pessoa.setAltura(0);
        pessoa.setAltura(1.90);
        System.out.println("Altura atualizada: " + pessoa.getAltura());


        pessoa.apresentar();

        System.out.println(pessoa);
    }
}
