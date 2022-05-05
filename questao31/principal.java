package questao31;
import java.util.Scanner;

public class principal {
    public static void main (String [] args){
        Scanner ent = new Scanner(System.in);
        
        
        System.out.println("Insira um numero pertencente aos reais: ");
        int rea = ent.nextInt();
        
        System.out.println("Insira um numero pertencente aos imaginarios: ");
        int ima = ent.nextInt();
        
        Numero numero1 = new Numero(rea, ima);
        Numero numero2 = new Numero(rea);
        Numero numero3 = new Numero();
        
        System.out.println(numero1.toString());
        System.out.println(numero2.toString());
        System.out.println(numero3.toString());

        ent.close();
    }
}
