package entidades;

public class Aluno {
    
    private String nome;
    private double av1;
    private double media;
    private double ado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAv1() {
        return av1;
    }

    public void setAv1(double av1) {
        this.av1 = av1;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia() {
        this.media = (ado + av1) / 2;
    }

    public double getAdo() {
        return ado;
    }

    public void setAdo(double ado) {
        this.ado = ado;
    }
    
    
}
