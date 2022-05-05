package questao26;
import java.util.Scanner;

public class principal {
    public static void main (String [] args) {
        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);
        
        Fatura fatura = new Fatura();

        System.out.println("Numero de identificaçao: ");
        fatura.numIdent = ent.nextInt();

        System.out.println("Descricao: ");
        fatura.descricao = ent1.nextLine();
        
        System.out.println("Quantidade: ");
        fatura.qtdComprada = ent.nextInt();

        if (fatura.qtdComprada <= 0){
            fatura.qtdComprada = 0;
        }
       
        System.out.println("Preco por unidade: ");
        fatura.precoUni = ent.nextFloat();

        if (fatura.precoUni <= 0.0f){
            fatura.precoUni = 0.0f;
        }
        System.out.printf("%.2f\n", fatura.fatura = fatura.calculaTotal());

        ent.close();
        ent1.close();

    }
    
}
