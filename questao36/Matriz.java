package questao36;
import  java.util.Scanner;
/* Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float usando um array de duas dimensões. Nesta classe, além do construtor, escreva um método que calcule o determinante da matriz encapsulada, e um método que permita a impressão formatada dos seus valores. Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */

public class Matriz {
    
    private float[][] matriz;
    private int tam;

    public Matriz(int tam){
        this.tam = tam;
        this.matriz = new float [this.tam][this.tam];
    }

    public void preecheMatriz (){
        Scanner num = new Scanner(System.in);
        int i, j;
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz.length; j++) {
                System.out.printf("[%d][%d] = ", i+1 , j+1);
                matriz[i][j] = num.nextFloat();
            }
        }
        num.close();
    }

    private float determinante(){
        return ((this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]));
    }

    public void imprime () {
        int i, j;
        
        System.out.println();
        System.out.println("============");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz.length; j++) {

                if( j == 0 ){
                    System.out.print("|");
                }

                System.out.print(" " + matriz[i][j] + " "); 
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("============");

        System.out.println();
        System.out.println("Determinante = " + determinante());
        System.out.println();
    }


}
