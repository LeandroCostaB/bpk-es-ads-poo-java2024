package exercicio14;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;
    private List<String> jogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        if (jogadores.size() < numeroDeJogadores) {
            jogadores.add(jogador);
            System.out.println(jogador + " foi adicionado ao time.");
        } else {
            System.out.println("O time já está completo.");
        }
    }

    public void removerJogador(String jogador) {
        if (jogadores.contains(jogador)) {
            jogadores.remove(jogador);
            System.out.println(jogador + " foi removido do time.");
        } else {
            System.out.println("Jogador não encontrado.");
        }
    }
}

