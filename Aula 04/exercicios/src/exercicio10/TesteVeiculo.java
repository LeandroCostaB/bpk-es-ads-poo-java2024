package exercicio10;

class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "XYZ-1234", "Dourado");

        System.out.println(veiculo);

        veiculo.abastecer();

        veiculo.lavar();

        Veiculo veiculoInvalido = new Veiculo("Moto", "", "Azul");

        veiculo.setTipo("");

        veiculo.setPlaca("");

        System.out.println(veiculo);
    }
}


