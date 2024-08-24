package exercicio11;


class Palindromo {
    public boolean ehPalindromo(String palavra) {
        String palavraReversa = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(palavraReversa);
    }
}

