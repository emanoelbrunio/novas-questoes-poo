package questao28;
import java.util.Scanner;
public class principal {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        Elevador elevador = new Elevador();

        System.out.println("Capacidade: ");
        int capacidadeDePe = ent.nextInt();
        System.out.println("Total de andares ");
        int andares = ent.nextInt();
        
        elevador.inicializa(capacidadeDePe, andares);
        
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Entrar +1 ");
        System.out.println("2 - Sair -1 ");
        System.out.println("3 - Subir +1 ");
        System.out.println("4 - Descer -1 ");
        
        int escolha= ent.nextInt();

        if (escolha == 1){
            elevador.entra();
        }
        else if (escolha == 2){
            elevador.sai();
        }
        else if (escolha == 3){
            elevador.sobe();
        }
        else if (escolha == 4){
            elevador.desce();
        }

        ent.close();
    }
}
