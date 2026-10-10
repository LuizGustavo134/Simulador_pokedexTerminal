package pesquisa.entities;

public class pokemon {
    private String nome;
    private String tipo;
    private String regiao;

    public pokemon() {
    }

    public pokemon(String nome, String tipo, String regiao) {
        this.nome = nome;
        this.tipo = tipo;
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "pokemon {" +"\n"+
                "nome : "+nome+'\n'+
                "tipo: "+tipo+'\n'+
                "regiao: "+regiao+'\n'+
                '}';
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
