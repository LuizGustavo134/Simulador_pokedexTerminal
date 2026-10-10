package services;

import entities.pokemon;

import java.util.Scanner;
/* Fluxo do sistema de adicionar de funcionamento da Pokedex*/
public class Interacao {
    Scanner scan = new Scanner(System.in);
    PokeList npoke = new PokeList();
     /////////////////// Menus ///////////////////////////
    public void menuInicial(){
        System.out.println("O que deseja fazer:");
        System.out.println("(1) Acessar a Pokedex (2) batalha Pokemon (3) sair ");
        int opt = scan.nextInt();
        if (opt == 1){
            menu2();
        }else if ( opt == 2){
            System.out.println("Opção Indisponível");
        } else {
            System.out.println("opções invalidas tente de novo");
        }
    }
    public void menu2(){
        System.out.println("(1)Add pokemon (2)Visualizar pokedex (3) atualizar");
        int opt = scan.nextInt();
        scan.nextLine();
        if (opt == 1){
            form1();
        } else if (opt == 2) {
        form2();
        }else if (opt ==3 ) {
            System.out.println("je");
    }else {
            System.out.println("Opção inválida");}}
    ////////////////////////Manipulação de dados/////////////////////////////
    public void form1(){ // CREATE
        int pp = 0;
        do {
            System.out.println("informe o nome do pokemon:");
            String nome = scan.nextLine();

            System.out.println("informe o tipo do pokemon:");
            String tipo = scan.nextLine();

            System.out.println("informe a região do pokemon:");
            String regiao = scan.nextLine();
            int id = npoke.pokedex.size() + 1;

            pokemon poker = new pokemon(id,nome, tipo, regiao);
            npoke.AddPokemon(poker);
            System.out.println("encerrar? y/n"); // define se o looping reinicia
            char res = scan.nextLine().charAt(0);
            if (res == 'y'){
                pp =+ 2; // chave do looping
                menu2();
            }
        }while (pp == 0);
    }

    public void form2(){ //READ
        int pp = 0;
        do {
            System.out.println("ver todos pokemons? y/n");
            char a = scan.nextLine().charAt(0);
            if (a == 'y'){
                npoke.ExibirTodos();
                menu2();
            } else {
                System.out.println("qual pokemon deseja ver?");
                System.out.println("Nome/tipo/regiao");
                String pesquisa = scan.nextLine();
                npoke.pesquisar(pesquisa);
                menu2();
            }
        } while (pp == 0);
}
        public void form3(){
            int pp = 0;
            do {
                System.out.println("O que deseja fazer:");
                System.out.println("(1) atualizar pokemon (2) deletar pokemon");
                int res = scan.nextInt();
                scan.nextLine();
                if (res == 1){
                    System.out.println("informe o ID");
                    int buscaID = scan.nextInt();
                    scan.nextLine();
                    System.out.println("informe o novo nome");
                    String novoNome = scan.nextLine();
                    System.out.println("informe o novo tipo");
                    String novoTipo = scan.nextLine();
                    System.out.println("informe a nova Região");
                    String novoRegiao = scan.nextLine();
                    npoke.AtualizarPokemon(buscaID, novoNome, novoTipo, novoRegiao);
                } else if (res == 2){
                    int buscaID = scan.nextInt();
                    scan.nextLine();
                    npoke.pesquisaPorID(buscaID);
                    System.out.println("tem certeza que deseja deletar esse pokemon? ");
                    System.out.println("obs: não é possivel reverter!");
                    System.out.println("y/n");
                    char a = scan.nextLine().charAt(0);
                    if (a == 'y') {
                        npoke.DeletarPokemon(buscaID);
                    }
                }
            } while (pp == 0);
        }
}
