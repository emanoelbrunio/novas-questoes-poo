package questao33;
/* Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para definir o atributo matricula automaticamente com um valor diferente para cada instância. Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar seu funcionamento.
*/
public class RegistroAcademico {

    private String nomeDoAluno;
	private String curso;
    
    //minha modificacao 
	private int matricula;
    static int numeroDeMatriculas = 1;
    // até aqui

	public RegistroAcademico(String nomeDoAluno, String curso) {
		this.nomeDoAluno =  nomeDoAluno;
		this.curso = curso;

        //minha modificacao
		this.matricula = RegistroAcademico.numeroDeMatriculas;
        RegistroAcademico.numeroDeMatriculas++;
        // até aqui
	}
	public String toString() {
		String result = "";
		result += ("Nome: " + this.nomeDoAluno + "\n");
		result += ("Matricula: " + this.matricula + "\n");
		result += ("Curso: " + this.curso + "\n");
		return result;
	}

}
