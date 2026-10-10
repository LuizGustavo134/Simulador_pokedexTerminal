package services;

import pesquisa.entities.pokemon;

import java.util.Scanner;

public class Interacao {
    public void iteracao1(){
        Scanner scan = new Scanner(System.in);
        PokeList npoke = new PokeList();
        int pp = 0;
        do {
            System.out.println("(1)Add pokemon (2)imprimir (3) sair");
            int opt = scan.nextInt();
            scan.nextLine();
            if (opt == 1) {
                System.out.println("informe o nome do pokemon:");
                String nome = scan.nextLine();

                System.out.println("informe o tipo do pokemon:");
                String tipo = scan.nextLine();

                System.out.println("informe a região do pokemon:");
                String regiao = scan.nextLine();
                pokemon poker = new pokemon(nome, tipo, regiao);
                npoke.AddPokemon(poker);
            } else if (opt == 2) {
                System.out.println("ver todos pokemons? y/n");
                char a = scan.nextLine().charAt(0);
                if (a == 'y'){
                    npoke.listarPokemon();
                } else if (!(a == 0)) {
                    System.out.println("qual pokemon deseja ver? 'nome'");
                    String pesquisa = scan.nextLine();
                    npoke.pesquisarPorNome(pesquisa);
                }
            }else{
                pp =+ 2;
            }
        }while (pp == 0);
    }
}
