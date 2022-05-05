package questao28;
/* Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o
andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo),
capacidade do elevador
e quantas pessoas estão presentes nele. 
 
A classe deve também disponibilizar os seguintes métodos:

inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);

sobe : para subir um andar (não deve subir se já estiver no último andar);
desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada.*/

public class Elevador {
    int andarAtual;
    int totAndar;
    int capacidade;
    int qtdPessoas;

    void inicializa (int capacidade, int totAndar){
        this.capacidade = capacidade;
        this.totAndar = totAndar;

        this.qtdPessoas = 0;
        this.andarAtual = 0;
    }

    void entra(){
        if (this.qtdPessoas < this.capacidade){
            System.out.println("Uma pessoa entrou");
            this.qtdPessoas++;
        }
        else {
            System.out.println("Não pode entrar");
        }
    }

    void sai(){
        if (this.qtdPessoas > 0){
            System.out.println("Uma pessoa saiu");
            qtdPessoas--;
        }
        else {
            System.out.println("Não pode sair ninguem");
        }
    }

    void sobe(){
        if (this.andarAtual < this.totAndar){
            System.out.println("Subiu um andar");
            this.andarAtual++;
        }

        else {
            System.out.println("Não pode subir mais");
        }
    }
    
    void desce(){
        if (this.andarAtual > 0){
            System.out.println("Desceu um andar");
            this.andarAtual--;
        }
        else {
            System.out.println("Não pode descer mais");
        }
    }

}
