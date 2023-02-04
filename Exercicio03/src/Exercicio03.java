import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        //variaveis
        int patinhos, totalPatinhos;

        Scanner teclado = new Scanner(System.in);

        try {
            //solicitar o usuario uma quantidade
            System.out.println("Digite a quantidade de patinhos: ");
            patinhos = teclado.nextInt();

            // Laço de repetição While
            do {
                //guardar a qtn de patos
                totalPatinhos = patinhos;

                //repetir enquanto tiver patinhos
                System.out.println(patinhos + " patinhos foram passear");

                for (int contador = 0; contador < patinhos; contador++) {
                    //removendo a quantidade de patinhos a cada laço
                    patinhos--;
                    //imprimir parte da música
                    System.out.println("Além das montanhas");
                    System.out.println("Para brincar");
                    System.out.println("A mamãe gritou: Quá, quá, quá, quá… Mas só " + patinhos + " patinhos voltaram de lá.");
                }
            }
                //quando tiver  0 patinhos no laço, finalizar a musica
                while(patinhos != 0);
                System.out.println("A mamãe patinha foi procurar");
                System.out.println("Além das montanhas");
                System.out.println("Na beira do mar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("E os " + totalPatinhos + " patinhos voltaram de lá.");
        }
        catch(InputMismatchException e){
                System.out.println("Valor digitado não é um número valido");
            }
        catch(Exception e){
                System.out.println(e);
            }
        finally {
            teclado.close();
        }
    }
}