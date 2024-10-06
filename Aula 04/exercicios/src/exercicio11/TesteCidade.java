package exercicio11;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Paraná", 12000000, "PR");

        System.out.println(cidade);

        cidade.aumentarPopulacao(250000);

        cidade.diminuirPopulacao(30500);

        System.out.println(cidade);
    }
}
