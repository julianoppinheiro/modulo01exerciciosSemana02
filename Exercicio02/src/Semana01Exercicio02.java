import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Semana01Exercicio02 {
    public static void main(String[] args)
    {

        ArrayList<Aluno> listaAluno = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        //adicionar ao array
        listaAluno.add(new Aluno(1+new Date().getTime(),"João Fulano","Turma 1"));
        listaAluno.add(new Aluno(2+new Date().getTime(),"Laura Ciclano","Turma 2"));
        listaAluno.add(new Aluno(3+new Date().getTime(),"Victor Beltrano","Turma 3"));
        listaAluno.add(new Aluno(4+new Date().getTime(),"Pedro Fulano","Turma 1"));
        listaAluno.add(new Aluno(5+new Date().getTime(),"Ana Beltrano","Turma 2"));



        //imprimindo a lista utilizando o for
        for (Aluno p : listaAluno) {
            System.out.println("------------------------------------");
            System.out.println("Matricula: " + p.getMatricula());
            System.out.println("Nome do Aluno: " + p.getNome());
            System.out.println("Turma: " + p.getTurma());

    
            //solicitar as notas
            System.out.printf("Digite a nota 1: ");
            double nota1 = teclado.nextDouble();
            System.out.printf("Digite a nota 2: ");
            double nota2 = teclado.nextDouble();
            System.out.printf("Digite a nota 3: ");
            double nota3 = teclado.nextDouble();
            System.out.printf("Digite a nota 4: ");
            double nota4 = teclado.nextDouble();

            double media = p.CalcularMedia(nota1, nota2, nota3, nota4);

            p.setMedia(media);
            System.out.println("Média do Aluno: " + p.getMedia());

        }

        //Imprimindo o resultado final
        System.out.println("------Imprimindo a lista final-----");
        System.out.println(listaAluno.toString());

    }
}