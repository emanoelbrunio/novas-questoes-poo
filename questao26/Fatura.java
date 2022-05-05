package questao26;

/* Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a quantidade comprada e o preço unitário.
1. Se a quantidade não for positiva, ela deve ser configurada como 0.

2. Se o preço por item não for positivo, ele deve ser configurado como 0.0.

3. Forneça também um método chamado calculaTotal que calcula e retorna o valor de fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste que demonstre as capacidades da classe criada.


*/

class Fatura {
    int numIdent;
    String descricao;
    int qtdComprada;
    float precoUni;
    float fatura;

    float calculaTotal () {

        this.fatura = this.qtdComprada * this.precoUni; 
        return this.fatura;

    }
    
}
