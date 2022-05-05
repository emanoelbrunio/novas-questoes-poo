package questao27;

import java.util.Scanner;

public class principal {
    public static void main (String [] args) {
        Scanner ent1 = new Scanner(System.in);
        Scanner ent2 = new Scanner(System.in);
        Scanner ent3 = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.println("Matricula");
        aluno.matricula = ent1.nextInt();

        System.out.println("Nome: ");
        aluno.nome = ent2.nextLine();
        
        System.out.println("Prova 1:");
        aluno.nProva1 = ent3.nextDouble();

        System.out.println("Prova 2:");
        aluno.nProva2 = ent3.nextDouble();

        System.out.println("Trabalho:");
        aluno.ntrabalho = ent3.nextDouble();

        aluno.media = aluno.media();

        System.out.printf("Precisa de %.2f para chegar a media 7\n", aluno.provaFinal());

        ent1.close();
        ent2.close();
        ent3.close();
    }
}
