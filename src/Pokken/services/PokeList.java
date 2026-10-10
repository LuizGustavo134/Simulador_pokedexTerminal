package services;

import java.util.ArrayList;
import java.util.List;
import pesquisa.entities.pokemon;

public class PokeList {
    List<pokemon> pokedex = new ArrayList<>();

    public void AddPokemon(pokemon poker){
        pokedex.add(poker);
    }
    public void listarPokemon(){
        for ( pokemon Pokex : pokedex){
            System.out.println(Pokex);
        }
    }
    public void pesquisarPorNome(String pesquisa) {
        for (pokemon Pokex : pokedex) {
            if (Pokex.getNome().equalsIgnoreCase(pesquisa)){
            System.out.println(Pokex);
            }
        }
    }}
