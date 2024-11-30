package exercicioCarro;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(500, "AP", 1500, 300, TipoCombustivel.GASOLINA);

        System.out.println(motor);

        motor.ligar();
        motor.desligar();


        Carro carro = new Carro("V6", motor);

        System.out.println(carro);
    }
}
