package questao35;

public class principal {
    public static void main(String[] args) {
		
		EntradaEmAgenda entrada = new EntradaEmAgenda(10, 21, 12, 2022, "assunto1");

		EntradaEmAgenda entrada1 = new EntradaEmAgenda(11, 22, 01, 2023, "assunto2");

		Agenda[] agenda = new Agenda[2]; 

		agenda[0] = new Agenda();
		agenda[1] = new Agenda();
				
		agenda[0].entrada = entrada;
		agenda[1].entrada = entrada1;
		
		
		entrada.toString();
		 
		
	}
}
