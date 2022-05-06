package questao37;
import java.util.ArrayList;
/* Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone. Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que se digite um número de ID negativo. Em seguida, exiba os dados de todos os clientes.
*/
public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    ArrayList<Cliente> lista;
    
    Cliente(int id, String nome, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    // new ArrayList<>;

    public String toString() {
		String result = "";

        result += ("ID: " + this.id + "\n");

        result += ("Nome: " + this.nome + "\n");

        result += ("Idade: " + this.idade + "\n");
        
        result += ("Telefone: " + this.telefone + "\n\n");

		return result;
	}

    
}
