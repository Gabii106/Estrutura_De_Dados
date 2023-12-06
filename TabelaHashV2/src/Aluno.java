import java.util.Objects;

public class Aluno {
    private String nome;
    private int matricula;
    private double media;
    public Aluno(String nome, int matricula, double media) {
        this(nome, matricula, media, null);
    }
    public Aluno(String nome, int matricula, double media, Aluno proximo) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno other = (Aluno) o;
        return matricula == other.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, media);
    }

    @Override
    public String toString(){
        return nome + " (" + matricula + ")";
    }
}
