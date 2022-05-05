package questao30;
import java.util.Scanner;

public class principal {
    public static void main (String [] args){
        Scanner ent = new Scanner(System.in);
        
        Lampada lampada = new Lampada();

        
        System.out.println("Escolha uma opcao para a lampada: ");
        System.out.println("1 - Acender ");
        System.out.println("2 - Apagar ");
        System.out.println("3 - Mostrar o estado atual");
        System.out.println("4 - Quantas vezes foi acesa");
        
        int escolha= ent.nextInt();

        if (escolha == 1){
            lampada.acende();
        }
        else if (escolha == 2){
            lampada.apaga();
        }
        else if (escolha == 3){
            lampada.mostraEstado();
        }
        else if (escolha == 4){
            lampada.contador.imprimir();
        }
       
        ent.close();
    }
}
