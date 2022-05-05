package questao29;
import java.util.Scanner;

public class principal {
    public static void main (String [] args){
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira um numero para iniciar a contagem de eventos: ");
        int i = ent.nextInt();

        Contador contador = new Contador(i);
        
        System.out.println("Escolha uma opcao para o contador: ");
        System.out.println("1 - Zerar ");
        System.out.println("2 - Adicionar +1 ");
        System.out.println("3 - Imprimir ");
        
        int escolha= ent.nextInt();

        if (escolha == 1){
            contador.zerar();
        }
        else if (escolha == 2){
            contador.incrementar();
        }
        else if (escolha == 3){
            contador.imprimir();
        }
       

        ent.close();

    }
}
