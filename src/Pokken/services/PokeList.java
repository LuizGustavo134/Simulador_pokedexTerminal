package services;

import java.util.ArrayList;
import java.util.List;
import entities.pokemon;
// manipulação da pokedex
public class PokeList {
    List<pokemon> pokedex = new ArrayList<>();

    //adiciona um pokemon na pokedex
    public void AddPokemon(pokemon poker){
        pokedex.add(poker);
    }
    // exibe a lista completa
    public void ExibirTodos(){
        if (pokedex.isEmpty() ){
            System.out.println("Pokedex vazia....");
            System.out.println("Registre novos pokemons primeiro!!!");}
        for ( pokemon Pokex : pokedex){
            System.out.println(Pokex);
        }
    }
    // pesquisa o pokemon solicitado com base no critério fornecido
    public void pesquisar(String pesquisa) {
        for (pokemon Pokex : pokedex) {
            if (Pokex.getNome().equalsIgnoreCase(pesquisa)){
            System.out.println(Pokex);
            } else if (Pokex.getRegiao().equalsIgnoreCase(pesquisa)) {
                System.out.println(Pokex);
            } else if (Pokex.getTipo().equalsIgnoreCase(pesquisa)) {
            System.out.println(Pokex);
        }
        }
    }
    public void pesquisaPorID(int buscaID) {
        for (pokemon Pokex : pokedex) {
            if (buscaID == Pokex.getId()){
                System.out.println(Pokex);
            } else{
                System.out.println("Pokemon não encontrado ");
            }
        }
    }
    public void AtualizarPokemon(int buscaID,String novoNome,String novoTipo, String novaRegiao) {
        for (pokemon Pokex : pokedex) {
            if (buscaID == Pokex.getId()){
                Pokex.setNome(novoNome);
                Pokex.setTipo(novoTipo);
                Pokex.setRegiao(novaRegiao);
            }
    }
    }
    public void DeletarPokemon(int buscaID){
        boolean removido = pokedex.removeIf(Pokex -> Pokex.getId() == buscaID);
        if (removido) {
            System.out.println("Pokémon deletado com sucesso!");
        } else {
            System.out.println("Pokémon com o ID " + buscaID + " não foi encontrado.");
        }
    }}
