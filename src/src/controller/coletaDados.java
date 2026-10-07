package controller;
import model.pokemon;
import java.util.Scanner;
import View.pokedex;

public class coletaDados {
    Scanner scan = new Scanner(System.in);
    public void cadastrar(pokedex pok){

        System.out.println("nome do pokemon:");
        String nome = scan.nextLine();

        System.out.println("tipo primario do pokemon:");
        String tipo1 = scan.nextLine();

        System.out.printf("*Opcional aperte enter*  ");
        System.out.println("tipo secundario do pokemon:");
        String tipo2 = scan.nextLine();

        System.out.println("Região do pokemon:");
        String regiao = scan.nextLine();

        System.out.println("Resumo do pokemon:");
        String resumo = scan.nextLine();

        pokemon poker = new pokemon(nome,tipo1,tipo2,regiao,resumo);
        pok.addPokemon(poker);
    }
}
