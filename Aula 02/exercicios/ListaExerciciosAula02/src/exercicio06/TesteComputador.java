package exercicio06;

class ComputadorTeste {
    public static void main(String[] args) {
        Computador meuComputador = new Computador("Intel i5", 8, 512);
        meuComputador.ligar();
        meuComputador.desligar();
    }
}

