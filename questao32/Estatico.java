package questao32;

/* Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três, quatro e cinco valores, considerando que os argumentos e retorno dos métodos podem ser dos tipos int e double. Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/

public class Estatico {

    static int v1;
    static int v2;
    static int v3;
    static int v4;
    static int v5;


    int maiorDois(int v1, int v2){
        if (v1 > v2){
            return v1;
        }
        else if (v2 > v1){
            return v2;
        }
        else {
            return -1;
        }
    }

    int maiorTres(int v1, int v2, int v3){
        if (v1 > v2 && v1 > v3){
            return v1;
        }
        else if (v2 > v1 && v2 > v3){
            return v2;
        }
        else if (v3 > v1 && v3 > v2){
            return v3;
        }
        else {
            return -1;
        }

    }
    
    int maiorQuatro(int v1, int v2, int v3, int v4){
        if (v1 > v2 && v1 > v3 && v1 > v4){
            return v1;
        }
        else if (v2 > v1 && v2 > v3 && v2 > v4){
            return v2;
        }
        else if (v3 > v1 && v3 > v2 && v3 > v4){
            return v3;
        }
        else if (v4 > v1 && v4 > v2 && v4 > v3){
            return v4;
        }
        else {
            return -1;
        }

    }
    
    int maiorCinco(int v1, int v2, int v3, int v4, int v5){
        if (v1 > v2 && v1 > v3 && v1 > v4 && v1 > v5){
            return v1;
        }
        else if (v2 > v1 && v2 > v3 && v2 > v4 && v2 > v5){
            return v2;
        }
        else if (v3 > v1 && v3 > v2 && v3 > v4 && v3 > v5){
            return v3;
        }
        else if (v4 > v1 && v4 > v2 && v4 > v3 && v4 > v5){
            return v4;
        }
        else if (v5 > v1 && v5 > v2 && v5 > v3 && v5 > v4){
            return v5;
        }
        else {
            return -1;
        }
    }
}
