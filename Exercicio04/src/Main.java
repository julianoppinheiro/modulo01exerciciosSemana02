import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Instância da classe Scanner, objeto para ler o que o usuário digitar
        Scanner leitor = new Scanner(System.in);

        // Instância da classe, objeto animal
        Animal animal1 = new Animal();

        // Solicitando dados para o usuário
        System.out.printf("Digite a raca do animal: ");
        animal1.setRaca(leitor.nextLine());

        System.out.printf("Digite a cor do animal: ");
        animal1.setCor(leitor.next());

        System.out.printf("Digite o peso do animal: ");
        animal1.setPeso(leitor.nextDouble());

        System.out.printf("Digite a idade do animal: ");
        animal1.setIdade(leitor.nextInt());

        // Saída: impressão no terminal o texto com os valores de animal
        System.out.println("A raca do animal é: " + animal1.getRaca()
                + ", cor: " + animal1.getCor() + ", peso: "
                + animal1.getPeso() + ", idade: " + animal1.getIdade());

        // Instância da classe cachorro, já passando os valores via parâmetro
        Cachorro cachorro1 = new Cachorro("Salsicha", "Amarela", 10.2,
                3, 10, "Pelo Liso", true);

        // Saída: impressão no terminal o texto com os valores de cachorro
        // (atributos/variáveis preenchidas via parâmetro na instância da classe)
        System.out.println("A raca DO CACHORRO é: " + cachorro1.getRaca()
                + ", cor: " + cachorro1.getCor() + ", peso: "
                + cachorro1.getPeso() + ", idade: " + cachorro1.getIdade()
                + ", volume do latido: " + cachorro1.getVolumeLatido()
                + ", tipo da pelagem: " + cachorro1.getTipoPelagem()
                + ", é caçador: " + cachorro1.isCacador());

        System.out.println("Cachorro...");

        // Invocando/chamando os métodos herdados da superclasse animal para cachorro
        cachorro1.FazerBarulho();
        cachorro1.Dormir();
        cachorro1.Andar();

        // Métodos somente de cachorro
        cachorro1.ComerChinelo();
        cachorro1.Correr();

        System.out.println("Animal...");

        // Invocando/chamando os métodos de animal
        animal1.FazerBarulho();
        animal1.Dormir();
        animal1.Andar();

        Salsicha cachorrinhoSalsicha = new Salsicha();
        // Instância da classe cachorro, já passando os valores via parâmetro
        cachorrinhoSalsicha.setRaca("Salsicha");
        cachorrinhoSalsicha.setCor("Azul");
        cachorrinhoSalsicha.setPeso(5.0);
        cachorrinhoSalsicha.setIdade(3);
        cachorrinhoSalsicha.setVolumeLatido(10);
        cachorrinhoSalsicha.setTipoPelagem("Pelo Liso");
        cachorrinhoSalsicha.setCacador(false);

        System.out.println(cachorrinhoSalsicha.toString());

    }
}