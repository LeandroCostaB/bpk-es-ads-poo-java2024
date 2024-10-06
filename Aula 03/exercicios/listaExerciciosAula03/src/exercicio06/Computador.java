package exercicio06;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public int getArmazenamento() {
        return armazenamento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento <= 0) {
            throw new IllegalArgumentException("O armazenamento não pode ser negativo nem 0.");
        }
        this.armazenamento = armazenamento;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        if (memoriaRAM <= 0) {
            throw new IllegalArgumentException("A memória RAM não pode ser negativa nem 0.");
        }
        this.memoriaRAM = memoriaRAM;
    }

    public void setProcessador(String processador) {
        if (processador == null || processador.trim().isEmpty()) {
            throw new IllegalArgumentException("O processador não pode ser vazio.");
        }
        this.processador = processador;
    }

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

