package exercicio10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        setTipo(tipo); // Usando o setter para validação
        setPlaca(placa); // Usando o setter para validação
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("Tipo de veículo não pode ser vazio.");
        } else {
            this.tipo = tipo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            System.out.println("Placa não pode ser vazia.");
        } else {
            this.placa = placa;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O veículo com placa " + placa + " foi abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo com placa " + placa + " foi lavado.");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}

