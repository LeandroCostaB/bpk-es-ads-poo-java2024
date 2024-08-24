package exercicio11;

class CidadeTeste {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Paraná", 12000000, "PR");
        cidade.aumentarPopulacao(250000);
        cidade.diminuirPopulacao(30500);
    }
}

