public class Salsicha extends Cachorro{
    @Override
    public String toString() {
        return "Salsicha: Raça: "+ getRaca() +", Cor: " + getCor()+ ", Peso: " + getPeso() + ", Idade: " + getIdade() + ", VolumeLatido: " + getVolumeLatido() +
        ", TipoPelagem: "+ getTipoPelagem() + ", Caçador:" + isCacador();
    }
}