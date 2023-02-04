public class Gato extends Animal{
    private int volumeMiado;
    private boolean tigrado;
    private String porte;

    public Gato() {

    }

    public Gato(int volumeMiado, boolean tigrado, String porte) {
        this.volumeMiado = volumeMiado;
        this.tigrado = tigrado;
        this.porte = porte;
    }

    public int getVolumeMiado() {
        return volumeMiado;
    }

    public boolean isTigrado() {
        return tigrado;
    }

    public String getPorte() {
        return porte;
    }

    public void setVolumeMiado(int volumeMiado) {
        this.volumeMiado = volumeMiado;
    }

    public void setTigrado(boolean tigrado) {
        this.tigrado = tigrado;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void Miar () {
        System.out.println("O gato está miando...");
    }

}