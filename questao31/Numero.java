package questao31;
/*Escreva uma classe para representar um número complexo. Essa classe deve conter três construtores.
1. Um construtor deverá receber os dois valores (parte real e parte imaginária) como argumentos,
2.  o outro somente o valor real, considerando o imaginário como sendo zero,

3. e o terceiro construtor não recebe argumentos, considerando as partes real e imaginária do número complexo como sendo iguais a zero.

Escreva um método toString e o use em um aplicativo de teste que demonstre as capacidades da classe criada.
*/
public class Numero {
    private double real;
    private double imaginario;

    Numero(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    Numero(double real){
        this.real = real;
        this.imaginario = 0;   
    }
    Numero(){
        this.real = 0;  
        this.imaginario = 0;  
    }

    public String toString(){
        return "[" + this.real + ", " + this.imaginario + "]";
    }
}
