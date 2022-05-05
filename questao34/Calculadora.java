package questao34;
/* Escreva uma classe para representar uma calculadora que realiza as quatro operações básicas. Os métodos dessa classe devem aceitar qualquer combinação de tipos números como seu parâmetros (e.g.: soma(5,3.2f), divide(5.1,17)...). Não utilize sobrecarga de métodos. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/

public class Calculadora {
    
    private double a;
    private double b;

    Calculadora (double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double soma(){
        return this.a + this.b;
    }
    
    public double subtrai(){
        return this.a - this.b;
    }
    
    public double multiplica(){
        return this.a * this.b;
    }

    public double divide(){
        return this.a / this.b;
    }


}
