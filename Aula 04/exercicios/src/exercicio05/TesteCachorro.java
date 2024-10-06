package exercicio05;

public class TesteCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cleberson", "Golden", 2);

        System.out.println(cachorro);

        cachorro.setIdade(-1);
        System.out.println("Idade atual: " + cachorro.getIdade());

        cachorro.setIdade(3);
        System.out.println("Idade atualizada: " + cachorro.getIdade());

        cachorro.setNome("Rex");
        cachorro.setRaca("Labrador");
        System.out.println("Cachorro após atualização: " + cachorro);
    }
}
