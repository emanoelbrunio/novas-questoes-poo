package questao33;

public class RegistroAcademicoPosGraduacao  {

    private RegistroAcademico registro;
	private String tituloTese;
	private String orientador;
	
	public RegistroAcademicoPosGraduacao(String nomeDoAluno, String string, String curso, String tituloTese, String orientador) {

		registro = new RegistroAcademico(nomeDoAluno, curso);
		this.tituloTese = tituloTese;
		this.orientador = orientador;

	}
	
	public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientador) {
		this.registro = registro;
		this.tituloTese = tituloTese;
		this.orientador = orientador;

	}
	
	public String toString() {
		String result = registro.toString();
		result += ("Titulo da tese: " + this.tituloTese + "\n");
		result += ("Nome do orientador: " + this.orientador + "\n");
		return result;
	}
}
