package exercicio01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Torre Negra - A Escolha dos Três", "Stephen King", 500);

        livro1.setNumeroDePaginas(20);  // Como o set já verifica, podemos usar diretamente
        System.out.println("Número de páginas atualizado: " + livro1.getNumeroDePaginas());

        System.out.println(livro1);

        livro1.lerPagina();


        livro1.abrirLivro();
        livro1.lerPagina();
        System.out.println("Página atual: " + livro1.getPaginaAtual());

        System.out.println("O livro está aberto? " + livro1.livroAberto());

        for (int i = 0; i < 20; i++) {
            livro1.lerPagina();
            System.out.println("Página atual: " + livro1.getPaginaAtual());
        }

        if (livro1.isConcluido()) {
            System.out.println("O livro foi concluído.");
        } else {
            System.out.println("Ainda faltam páginas para concluir o livro.");
        }

        System.out.println(livro1);
    }
}
