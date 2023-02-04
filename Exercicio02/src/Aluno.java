public class Aluno {
    private Long matricula;
    private String nome;
    private String turma;
    private Double nota1, nota2, nota3, nota5, media;

    public Aluno(Long matricula, String nome, String turma) {
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno() {

    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", media=" + media +
                '}';
    }

    public double CalcularMedia(Double nota1, Double nota2, Double nota3, Double nota4){
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
}
