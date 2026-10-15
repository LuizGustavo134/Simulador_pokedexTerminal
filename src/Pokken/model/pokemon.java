package model;

import java.util.Arrays;

// Essa classe é apenas a entidade/molde para o "pokemon"
public class pokemon {
    private int id;
    private String nome;
    private String[] tipos;
    private String regiao;
    private String golpesEquipados[] = new String[3];

    public pokemon() {
    }
    public pokemon(int id , String nome, String[] tipos, String regiao) {
        this.id = id;
        this.nome = nome;
        this.tipos = tipos;
        this.regiao = regiao;
    }
    public pokemon(int id , String nome, String[] tipos, String regiao, String[] golpesEquipados) {
        this.id = id;
        this.nome = nome;
        this.tipos = tipos;
        this.regiao = regiao;
        this.golpesEquipados = golpesEquipados;
    }

    @Override
    public String toString() {
        return "Pokemon N°:"+
                id +"\n"+
                "nome : "+nome+'\n'+
                "tipo: "+ Arrays.toString(tipos) +'\n'+
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

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
