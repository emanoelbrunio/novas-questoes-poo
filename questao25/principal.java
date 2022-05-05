package questao25;

import java.util.Scanner;

public class principal {
    public static void main (String [] args){
        Scanner ent = new Scanner(System.in);

        Time time = new Time();
           

        System.out.println("Nome do esporte: ");
        time.esporte = ent.nextLine();

        System.out.println("Nome do time: ");
        time.nome = ent.nextLine();

        System.out.println("Insira os gols feitos: ");
        time.feitos = ent.nextInt();
        System.out.println("Insira os gols levados: ");
        time.levados = ent.nextInt();
        
        time.resulPartida();
        System.out.printf("vitorias: %d\n", time.vitorias);
        System.out.printf("derrotas: %d\n", time.derrotas);
        System.out.printf("empates: %d\n", time.empates);

        ent.close();
    }
}
