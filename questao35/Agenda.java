package questao35;
/* Crie também uma classe Agenda que encapsule uma agenda de compromissos que será representada por um array de instâncias da classe EntradaEmAgenda. Crie um método listaDia que recebe valores de dia, mês e ano e lista todas as instâncias de EntradaEmAgenda que caem naquele dia, mês e ano
*/

public class Agenda {
    private int hora;
    private String assunto;
    EntradaEmAgenda entrada;
    
    Agenda(){
        
    }
    Agenda (EntradaEmAgenda entrada, int hora, String assunto){
        this.hora = hora;
        this.assunto = assunto;
        this.entrada = entrada;
    }

    void listaDia (int dia, int mes, int ano){

        entrada = new EntradaEmAgenda(this.hora, dia, mes, ano, this.assunto);
        
    }
}
