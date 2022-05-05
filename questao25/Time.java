package questao25;

// Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da classe criada.

class Time {
    String nome;
    String esporte;
    int pontos;
    int vitorias;
    int derrotas;
    int posicao;
    int empates;
    int levados;
    int feitos;
    
    void resulPartida () {
        
        if (levados > feitos){
            this.derrotas++;
            System.out.printf("O time perdeu! :(\n");
        }
        else if (levados < feitos){
            this.vitorias++;
            System.out.printf("O time ganhou! :)\n");
        }
        else if (levados == feitos){
            this.empates++;
            System.out.printf("O time empatou! :|\n");
        }
    }
}
