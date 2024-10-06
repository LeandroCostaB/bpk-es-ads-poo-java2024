package exercicio09;

class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Furadeira", 500, 1000);

        System.out.println(produto);

        produto.aumentarEstoque(50);

        produto.diminuirEstoque(200);

        System.out.println(produto);

        produto.diminuirEstoque(-30);

        produto.aumentarEstoque(-10);

        produto.diminuirEstoque(1000);
    }
}
