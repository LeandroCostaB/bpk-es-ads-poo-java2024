package exercicio02;

public class TesteCelular {
    public static void main(String[] args) {
        Celular xiaomi = new Celular("Xiaomi", "Redmi MI 10", "60mAh");

        System.out.println(xiaomi);

        xiaomi.setCapacidadeBateria("");
        xiaomi.setCapacidadeBateria(null);

        xiaomi.setCapacidadeBateria("4500mAh");
        System.out.println("Capacidade da bateria atualizada: " + xiaomi.getCapacidadeBateria());

        xiaomi.ligar();
        xiaomi.ligar();

        xiaomi.desligar();
        xiaomi.desligar();

        System.out.println(xiaomi);
    }
}

