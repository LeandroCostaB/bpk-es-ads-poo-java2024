package exercicio20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a " + modelo + " da marca " + marca + ".");
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + modelo + ".");
    }

}

