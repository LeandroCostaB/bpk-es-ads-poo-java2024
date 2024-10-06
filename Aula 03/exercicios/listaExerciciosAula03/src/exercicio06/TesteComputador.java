package exercicio06;

class ComputadorTeste {
    public static void main(String[] args) {
        Computador meuComputador = new Computador("Intel i5", 8, 512);

        System.out.println(meuComputador.getMemoriaRAM());

        meuComputador.setMemoriaRAM(0);

        meuComputador.ligar();
        meuComputador.desligar();
    }
}

