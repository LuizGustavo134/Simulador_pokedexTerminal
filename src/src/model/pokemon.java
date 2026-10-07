package model;

import java.util.List;

public class pokemon {
    private static int contadorId = 1;
    private int id ;
    private String nome;
    private String tipo1;
    private String tipo2;
    private String regiao;
    private String resumo;

    public pokemon() {}
    public pokemon(String nome, String tipo1, String tipo2, String regiao, String resumo) {
        this.id = contadorId++;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.regiao = regiao;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}