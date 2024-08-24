package exercicio06;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("O computador está ligado.");
    }

    public void desligar() {
        System.out.println("O computador está desligado.");
    }
}

