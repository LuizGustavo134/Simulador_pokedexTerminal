package model;

import java.util.ArrayList;
import java.util.List;

public class golpes {
    private String tipo;
    private int dano;
    String[] TipoDePokemon = {
            "Normal", "Fogo", "Água", "Planta", "Elétrico", "Gelo",
            "Lutador", "Venenoso", "Terrestre", "Voador", "Psíquico",
            "Inseto", "Rocha", "Fantasma", "Dragão", "Sombrio", "Aço", "Fada"
    };

    public golpes() {
    }

    public golpes(String tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
