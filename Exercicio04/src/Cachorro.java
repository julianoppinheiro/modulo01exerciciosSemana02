public class Cachorro extends Animal {
    private int volumeLatido;
    private String tipoPelagem;
    private boolean cacador;

    public Cachorro() {

    }

    // Construtor, somente com os atributos de cachorro
    public Cachorro(int volumeLatido, String tipoPelagem, boolean cacador) {
        this.volumeLatido = volumeLatido;
        this.tipoPelagem = tipoPelagem;
        this.cacador = cacador;
    }

    // Construtor com todos os atributos: da superclasse tambem da classe cachorro
    public Cachorro(String raca, String cor, Double peso, int idade, int volumeLatido, String tipoPelagem, boolean cacador) {
        super(raca, cor, peso, idade);
        this.volumeLatido = volumeLatido;
        this.tipoPelagem = tipoPelagem;
        this.cacador = cacador;
    }

    // Métodos do cachorro (ações)
    public void Correr(){
        System.out.println("Cachorro Correndo...");
    }

    public void ComerChinelo(){
        System.out.println("Cachorro estragando o chinelo...");
    }

    public void FazerBarulho(){
        System.out.println("Cachorro fazendo barulho: latindo...");
    }

    // Encapsulamento
    public int getVolumeLatido() {
        return volumeLatido;
    }

    public void setVolumeLatido(int volumeLatido) {
        this.volumeLatido = volumeLatido;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public boolean isCacador() {
        return cacador;
    }

    public void setCacador(boolean cacador) {
        this.cacador = cacador;
    }
}