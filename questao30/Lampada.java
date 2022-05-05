package questao30;
/*Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: “A lampada esta acesa”). Inclua um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para isso, utilize uma instância da classe Contador criada na questão anterior e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/
public class Lampada {

    private int estadoDaLampada = 0; // 1 para ligada e 0 para apagada
    Contador contador = new Contador(0);

    void acende (){
        this.estadoDaLampada = 1;
        this.contador.incrementar();
    }
    void apaga() {
        this.estadoDaLampada = 0;
    }

    void mostraEstado() {
        if (this.estadoDaLampada == 1){
            System.out.println("A lampada esta acesa");
        }
        else {
            System.out.println("A lampada esta apagada");
        }
    }

    boolean estaLigada(){
        if (this.estadoDaLampada == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
