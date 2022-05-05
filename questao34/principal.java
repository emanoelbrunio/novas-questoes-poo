package questao34;

public class principal {
    public static void main(String[] args) {

		Calculadora calculadora1 = new Calculadora(2, 5);
		Calculadora calculadora2 = new Calculadora(10, 5);
		Calculadora calculadora3 = new Calculadora(2, 5);
		Calculadora calculadora4 = new Calculadora(4.8, 2);

		System.out.println(calculadora1.soma());
		System.out.println(calculadora2.subtrai());
		System.out.println(calculadora3.multiplica());
		System.out.println(calculadora4.divide());
	}
}
