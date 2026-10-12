package model;

import java.util.ArrayList;
import java.util.List;

public class pokemon {
    private int id;
    private String nome;
    private String tipo;
    private String regiao;

    public pokemon() {
    }

    public pokemon(int id ,String nome, String tipo, String regiao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Pokemon N°:"+
                id +"\n"+
                "nome : "+nome+'\n'+
                "tipo: "+tipo+'\n'+
                "regiao: "+regiao+'\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
