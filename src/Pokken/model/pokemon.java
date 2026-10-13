package model;

// Essa classe é apenas a entidade/molde para o "pokemon"
public class pokemon {
    private int id;
    private String nome;
    private String tipoUnico;
    private String regiao;
    private String golpesEquipados[] = new String[3];

    public pokemon() {
    }
    public pokemon(int id , String nome, String tipoUnico, String regiao) {
        this.id = id;
        this.nome = nome;
        this.tipoUnico = tipoUnico;
        this.regiao = regiao;
    }
    public pokemon(int id , String nome, String tipoUnico, String regiao, String[] golpesEquipados) {
        this.id = id;
        this.nome = nome;
        this.tipoUnico = tipoUnico;
        this.regiao = regiao;
        this.golpesEquipados = golpesEquipados;
    }

    @Override
    public String toString() {
        return "Pokemon N°:"+
                id +"\n"+
                "nome : "+nome+'\n'+
                "tipo: "+ tipoUnico +'\n'+
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

    public String getTipoUnico() {
        return tipoUnico;
    }

    public void setTipoUnico(String tipoUnico) {
        this.tipoUnico = tipoUnico;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
