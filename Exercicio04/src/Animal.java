public class Animal {
    private String raca, cor;
    private Double peso;
    private int idade;

    public Animal() {
    }

    public Animal(String raca, String cor, Double peso, int idade) {
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public Double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos comuns dos animal, métods da superclasse animal
    public void Dormir(){
        System.out.println("Animal dormindo...");
    }

    public void Andar(){
        System.out.println("Animal andando...");
    }

    public void FazerBarulho(){
        System.out.println("Animal fazendo barulho...");
    }

}