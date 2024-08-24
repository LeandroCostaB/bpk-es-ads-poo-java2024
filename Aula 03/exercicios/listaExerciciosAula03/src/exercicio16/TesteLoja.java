package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Loja Java", "Rua Principal, 123", "(11) 1234-5678");

        minhaLoja.abrirLoja();
        minhaLoja.fecharLoja();
    }
}

