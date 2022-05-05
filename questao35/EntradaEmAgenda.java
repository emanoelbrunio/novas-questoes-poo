package questao35;
/* Crie uma classe EntradaEmAgenda que contenha os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano, assunto).
Crie nesta classe, além do construtor e do método toString, um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia, mês e ano daquela instância da classe forem iguais aos argumentos passados. Crie também uma classe Agenda que encapsule uma agenda de compromissos que será representada por um array de instâncias da classe EntradaEmAgenda. Crie um método listaDia que recebe valores de dia, mês e ano e lista todas as instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
*/
public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
        
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    boolean ehNoDia (int dia, int mes, int ano){
        if (this.dia == dia && this.mes == mes && this.ano == ano){
            return true;
        }
        else { 
            return false;
        }
    }

    public String toString(){
        String data = "Hora: " + hora + ". Data: " + dia  + "/" + mes + "/" + ano + ". Assunto: " + assunto;
        return data;
    }
    
}
