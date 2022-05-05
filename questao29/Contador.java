package questao29;
/* Escreva a classe Contador que encapsule um valor usado para contagem de eventos. Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/
public class Contador {
    private int cont;

    Contador(int i) {
        this.cont = i;
    }

    void zerar (){
        this.cont = 0;
    }
    void incrementar(){
        this.cont += 1;
    }
    void imprimir(){
        System.out.println("Contador: " + this.cont);
    }
}
