package questao27;
/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados do 
aluno: matrícula,
nome,
2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:

media : calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
provaFinal : calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final) */


public class Alunos {
    int matricula;
    String nome;
    double nProva1;
    double nProva2;
    double ntrabalho;
    double media;

    double media(){
        this.media =  ( (this.nProva1 * 2.5) + (this.nProva2 * 2.5) + (this.ntrabalho * 2)) / 7;  
        return this.media;
    }

    double provaFinal (){
        if (media >= 7 || media <= 4) {
            return 0;
        }
        return 7 - media;
    }
}
