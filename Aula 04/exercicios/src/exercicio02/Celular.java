package exercicio02;

/**
 * 2 - Defina uma classe Celular com atributos como marca, modelo,
 * e capacidadeBateria.
 * Adicione métodos para ligar e desligar o celular.
 */
public class Celular {
    private String marca;
    private String modelo;
    private String capacidadeBateria;
    private Boolean ligado = false;

    public Celular(String marca, String modelo, String capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        setCapacidadeBateria(capacidadeBateria);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeBateria(String capacidadeBateria) {
        if (capacidadeBateria == null || capacidadeBateria.isEmpty()) {
            System.out.println("Capacidade da bateria não pode ser nula ou vazia.");
        } else {
            this.capacidadeBateria = capacidadeBateria;
        }
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando celular...");
            this.ligado = true;
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Desligando celular...");
            this.ligado = false;
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria='" + capacidadeBateria + '\'' +
                ", ligado=" + ligado +
                '}';
    }
}
