package questao33;

public class principal {
    public static void main(String[] args) {

		RegistroAcademicoPosGraduacao regPos1 = new RegistroAcademicoPosGraduacao("Joao", "12345678", "Psicologia", "Analise social", "Maria");

		RegistroAcademicoPosGraduacao regPos2 = new RegistroAcademicoPosGraduacao (new RegistroAcademico ("Pedro", "Direito"), "Direito processual", "Lara");

		RegistroAcademico reg1 = new RegistroAcademico("Fernanda", "Medicina");

		RegistroAcademicoPosGraduacao regPos3 = new RegistroAcademicoPosGraduacao(reg1, "Epidemiologia", "Eduardo");
		
		System.out.println(regPos1);
		System.out.println(regPos2);
		System.out.println(reg1);
		System.out.println(regPos3);
	}
}
