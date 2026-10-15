package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.pokemon;
// Essa classe gerencia os dados modelo CRUD todas as 4 operações apenas isso
public class PokeList1 {
    private List<pokemon> pokedex = new ArrayList<>();
    private int proximoId = 1; // Controla os IDs para evitar duplicatas

    // Adiciona um pokémon e incrementa o ID automaticamente
    public void AddPokemon(pokemon poker){
        pokedex.add(poker);
        proximoId++;
    }
    public int getProximoId() {
        return proximoId;
    }
    // Exibe a lista se houver registros
    public void ExibirTodos(){
        if (pokedex.isEmpty()){
            System.out.println("Pokedex vazia....");
            System.out.println("Registre novos pokémons primeiro!!!");
        }
        System.out.println(" Pokedex Completa");
        for (pokemon Pokex : pokedex){
            System.out.println(Pokex);
        }
    }
    // Pesquisa com vários critérios
    public void pesquisar(String pesquisa) {
        boolean encontrado = false;
        String temp = pesquisa;
        for (pokemon Pokex : pokedex) {
            if (Pokex.getNome().equalsIgnoreCase(pesquisa) ||
                    Pokex.getRegiao().equalsIgnoreCase(pesquisa) ||
            temp.equalsIgnoreCase(Pokex.getTipos()[0]) ||
            temp.equalsIgnoreCase(Pokex.getTipos()[0]))
                     {
                System.out.println(Pokex);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum Pokémon encontrado no parametro: " + pesquisa );
        }
    }
    // Pesquisa por ID
    public boolean pesquisaPorID(int buscaID) {
        boolean encontrado = false;
        for (pokemon Pokex : pokedex) {
            if (buscaID == Pokex.getId()){
                System.out.println(Pokex);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Pokémon do ID " + buscaID + " não existe.");
        }
    return encontrado;
    }

    // Atualizar
    public void AtualizarPokemon(int buscaID, String novoNome, String[] novoTipo, String novaRegiao) {
        boolean encontrado = false;
        for (pokemon Pokex : pokedex) {
            if (buscaID == Pokex.getId()){
                Pokex.setNome(novoNome);
                Pokex.setTipos(novoTipo);
                Pokex.setRegiao(novaRegiao);
                System.out.println("Pokémon atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("ID inexistente: " + buscaID );
        }
    }

    // Delete
    public void DeletarPokemon(int buscaID){
        boolean removido = pokedex.removeIf(Pokex -> Pokex.getId() == buscaID);
        if (removido) {
            System.out.println("Pokémon deletado com sucesso!");
        } else {
            System.out.println("Pokémon com o ID " + buscaID + " não foi encontrado.");
        }
    }
}