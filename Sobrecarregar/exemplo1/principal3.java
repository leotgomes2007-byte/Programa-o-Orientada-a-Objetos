package project;

public class principal3 {
	public static void main(String[] args) {
	
		Calculadora c = new Calculadora();
		
		int resultado1 = c.somar(2, 3);
		System.out.println("Resultado1: "+resultado1);

		resultado1 = c.somar(2, 3,4);
		System.out.println("Resultado2: "+resultado1);
		
		double resultado2 = c.somar(3.1,7);
		
		resultado1 = c.multiplicar(2,6);
		resultado2 = c.multiplicar(2.9,6);

	}
}
