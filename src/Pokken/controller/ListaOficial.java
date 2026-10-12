package controller;

import java.util.ArrayList;
import java.util.List;
import model.pokemon;
public class ListaOficial {
    List<pokemon>Kanto = new ArrayList<>();

    public ListaOficial() {
    }
    public void GerarLista(pokemon PP){ // related problem
        Kanto.add(PP);
    }
    public void ExibirTodos(){
        if (Kanto.isEmpty()){
            System.out.println("Pokedex vazia....");
        }else {
            System.out.println(" Pokedex Completa");
            for (pokemon PokedexOficial : Kanto) {
                System.out.println(PokedexOficial);
            }
        }}}
