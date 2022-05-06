package questao37;
import java.util.Scanner;
import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        
        ArrayList<Cliente> lista = new ArrayList<>();

        Scanner ent = new Scanner(System.in);
        Scanner ent1 = new Scanner(System.in);

        int i = 0;
        
        int id;
        do {
            int idade, telefone;
            String nome;
            System.out.printf("Cliente: %d\n", i+1);
            
            System.out.printf("ID: ");
            id = ent.nextInt();

            // se quiser receber um cliente com id negativo é só remover este if
            if (id < 0) {
                break;
            }

            System.out.printf("Nome: ");
            nome = ent1.nextLine();

            System.out.printf("Idade: ");
            idade = ent.nextInt();

            System.out.printf("Telefone: ");
            telefone = ent.nextInt();
            
            lista.add(new Cliente(id, nome, idade, telefone));
            
            i++;
            System.out.println();
        } while (id >= 0);

        System.out.println();
        System.out.println("Dados de todos os clientes:");

        int j = 0;
        while(j < lista.size()){
            System.out.printf("Cliente: %d\n", j+1);            
            System.out.print(lista.get(j).toString());
            j++;
        }
        
        ent.close();
        ent1.close();
    }
}
