package questao32;

public class principal {
    public static void main (String [] args){
        
        Estatico estatico = new Estatico();


        System.out.println(estatico.maiorDois(1, 2));
        System.out.println(estatico.maiorTres(1, 2, 3));
        System.out.println(estatico.maiorQuatro(1, 2, 3, 4));
        System.out.println(estatico.maiorCinco(1, 2, 3, 4, 5));
       
    }
}
