package model;
//estou planejando como desenvolver essa classe
public class golpes {
    private String tipo;
    private int dano;
    String[] tipoDeGolpe = {
            "Normal", "Fogo", "Água", "Planta", "Elétrico", "Gelo",
            "Lutador", "Venenoso", "Terrestre", "Voador", "Psíquico",
            "Inseto", "Rocha", "Fantasma", "Dragão", "Sombrio", "Aço", "Fada"
    };

    public golpes() {
    }
    /* em desenvolvimento
    public String equipar(){
        String golpeAleatório ="";
        for (int i=0; i<3 ;i++){
           golpeAleatório = tipoDeGolpe[i];
        }
        return golpeAleatório;
    }*/
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
