import java.util.ArrayList;
import java.util.Date;

public class Semana01Exercicio01 {
    public static void main(String[] args)
    {

        ArrayList<Aluno> listaAluno = new ArrayList<>();

        //adicionar ao array
        listaAluno.add(new Aluno(1+new Date().getTime(),"João Fulano","Turma 1", 9.0));
        listaAluno.add(new Aluno(2+new Date().getTime(),"Laura Ciclano","Turma 2", 8.1));
        listaAluno.add(new Aluno(3+new Date().getTime(),"Victor Beltrano","Turma 3", 3.6));
        listaAluno.add(new Aluno(4+new Date().getTime(),"Pedro Fulano","Turma 1", 10.0));
        listaAluno.add(new Aluno(5+new Date().getTime(),"Ana Beltrano","Turma 2", 7.5));
        listaAluno.add(new Aluno(6+new Date().getTime(),"Maria Ciclano","Turma 3", 4.4));
        listaAluno.add(new Aluno(7+new Date().getTime(),"Joaquina Fulano","Turma 1", 6.9));
        listaAluno.add(new Aluno(8+new Date().getTime(),"Zia Beltrano","Turma 2", 5.5));
        listaAluno.add(new Aluno(9+new Date().getTime(),"Humano Fulano","Turma 3", 9.0));
        listaAluno.add(new Aluno(10+new Date().getTime(),"Lucas Ciclano","Turma 2", 8.1));


        //imprimindo a lista utilizando o for
        for (Aluno p : listaAluno) {
            System.out.println("------------------------------------");
            System.out.println("Matricula: " + p.matricula);
            System.out.println("Nome do Aluno: " + p.nome);
            System.out.println("Turma: " + p.turma);
            System.out.println("Média: " + p.nome);
        }
    }
}