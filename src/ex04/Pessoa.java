package ex04;



public abstract class Pessoa {


    private String nome;
    private String rg;

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }
}
