package exercicio09;

class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Furadeira", 500, 1000);
        produto.aumentarEstoque(50);
        produto.diminuirEstoque(200);
    }
}
