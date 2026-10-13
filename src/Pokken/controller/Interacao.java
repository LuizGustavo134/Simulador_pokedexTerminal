package controller;

import model.pokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

// Classe "principal" que intermedia todas a classe do projeto
// e trata erro genéricos
public class Interacao {
    // classes instânciadas para
    Scanner scan = new Scanner(System.in);
    PokeList1 npoke = new PokeList1();
    RegiaoKanto RK = new RegiaoKanto();

    // 1. Menu Principal do Jogo(tela de inicio)
    public void menuInicial() {
        int opt = 0;
       // nucleo principal do projeto
        do {
            // tratamento de erros que se estende pelas outras classes
            try {
            System.out.println("| ================================= |");
            System.out.println("|        MENU PRINCIPAL POKÉMON     |");
            System.out.println("| ================================= |");
            System.out.println("| (1) Acessar a Pokédex             |");
            System.out.println("| (2) Acessar o menu de Batalha     |");
            System.out.println("| (3) Sair                          |");
            System.out.print("| Escolha uma opção:                   |");

            opt = scan.nextInt();
            scan.nextLine(); // Limpa o buffer

            if (opt == 1) {
                menu2();
            } else if (opt == 2) {
                System.out.println("\n[Aviso] Opção de Batalha Indisponível no momento.");
                System.out.print("Deseja ver a Pokédex oficial de Kanto? (y/n): ");
                char opt2 = scan.nextLine().charAt(0);

                if (opt2 == 'y' || opt2 == 'Y') {
                    RK.GerarPokemon();
                    RK.ExibirTodos();
                }
            } else if (opt == 3) {
                System.out.println("\nSaindo do programa. Até logo!");
                break;
            } else {
                System.out.println("\nOpção inválida! Tente de novo.");
            }

            } catch ( InputMismatchException inputMismatchException){
                System.out.println("dados inválidos!");
                System.out.println("digite corretamente para continuar");
                scan.nextLine(); //obrigatório para que o "loop" não quebre
            }// fim das exceções
        } while (opt != 3);
    }

    // 2. Submenu (inicio do CRUD)
    public void menu2() {
        int opt = 0;
        do {
            System.out.println("\n---------------------------------");
            System.out.println("         MENU DA POKÉDEX         ");
            System.out.println("---------------------------------");
            System.out.println("(1) Adicionar Pokémon");
            System.out.println("(2) Pesquisar Pokémon");
            System.out.println("(3) Atualizar / Deletar Pokémon");
            System.out.println("(4) Voltar ao Menu Inicial");
            System.out.print("Escolha uma opção: ");

            opt = scan.nextInt();
            scan.nextLine(); // Limpa o buffer

            if (opt == 1) {
                form1();
            } else if (opt == 2) {
                form2();
            } else if (opt == 3) {
                form3();
            } else if (opt == 4) {
                break; // Sai do menu2 e volta para o menuInicial
            } else {
                System.out.println("\nOpção inválida! Tente de novo.");
            }
        } while (opt != 4);
    }
    //manipulação manual de dados
    // 3. CREATE
    public void form1() {
        char res = 'n';
        do {
            System.out.println("\n--- CADASTRO DE NOVO POKÉMON ---");
            System.out.print("Informe o nome do Pokémon: ");
            String nome = scan.nextLine();

            System.out.print("Informe o tipo do Pokémon: ");
            String tipo = scan.nextLine();

            System.out.print("Informe a região do Pokémon: ");
            String regiao = scan.nextLine();

            // Pega o proximo ID para ordenar
            int id = npoke.getProximoId();

            // criando o primeiro obj
            pokemon poker = new pokemon(id, nome, tipo, regiao);
            npoke.AddPokemon(poker);
            System.out.println("Pokémon cadastrado com sucesso! (ID atribuído: " + id + ")");

            //controle de formulário
            System.out.print("\nDeseja voltar ao menu anterior? (y/n): ");
            res = scan.nextLine().charAt(0);

          //quebra de loop
        } while (res != 'y' && res != 'Y');
    }

    // 4. Consultar Pokémons
    public void form2() {
        char resp = 'n';
        do {
            System.out.println("\n--- CONSULTA DE POKÉMONS ---");
            System.out.print("Deseja ver todos os pokémons? (y/n): ");
            char a = scan.nextLine().charAt(0);

            if (a == 'y' || a == 'Y') {
                npoke.ExibirTodos();
            } else {
                System.out.print("Informe o Nome, Tipo ou Região que deseja pesquisar: ");
                String pesquisa = scan.nextLine();
                npoke.pesquisar(pesquisa);
            }

            System.out.print("\nDeseja fazer outra consulta? (y/n - 'n' volta ao menu): ");
            resp = scan.nextLine().charAt(0);
        } while (resp == 'y' || resp == 'Y');
    }

    // 5. UPDATE / DELETE (Atualizar ou Excluir Registros)
    public void form3() {
        int res = 0;
        do {
            System.out.println("\n--- GERENCIAMENTO DE REGISTROS ---");
            System.out.println("(1) Atualizar Pokémon");
            System.out.println("(2) Deletar Pokémon");
            System.out.println("(3) Voltar");
            System.out.print("Escolha uma opção: ");

            res = scan.nextInt();
            scan.nextLine(); // Limpa o buffer

            if (res == 1) {
                System.out.print("Informe o ID do Pokémon que deseja atualizar: ");
                int buscaID = scan.nextInt();
                scan.nextLine();

                System.out.print("Informe o novo nome: ");
                String novoNome = scan.nextLine();
                System.out.print("Informe o novo tipo: ");
                String novoTipo = scan.nextLine();
                System.out.print("Informe a nova região: ");
                String novaRegiao = scan.nextLine();

                npoke.AtualizarPokemon(buscaID, novoNome, novoTipo, novaRegiao);

            } else if (res == 2) {
                System.out.print("Informe o ID do Pokémon que deseja deletar: ");
                int buscaID = scan.nextInt();
                scan.nextLine();

                if (!npoke.pesquisaPorID(buscaID)) {
                    break;
                }

                System.out.println("Tem certeza que deseja deletar esse Pokémon?");
                System.out.println("Obs: Não é possível reverter!");
                System.out.print("Confirma a exclusão? (y/n): ");

                char a = scan.nextLine().charAt(0);
                if (a == 'y' || a == 'Y') {
                    npoke.DeletarPokemon(buscaID);
                } else {
                    System.out.println("Operação cancelada.");
                }
            } else if (res == 3) {
                break; // Sai do form3 de forma limpa e volta para o menu2
            } else {
                System.out.println("\nOpção inválida!");
            }
        } while (res != 3);
    }
}