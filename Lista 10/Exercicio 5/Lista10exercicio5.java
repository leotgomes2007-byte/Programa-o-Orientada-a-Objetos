package projeto;

import java.util.Scanner;

public class Lista10exercicio5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Informe o preço do produto");
		double produto = teclado.nextDouble();
		
		Produto p = new Produto(produto);
		p.calcularPrecoFinal();
		
		System.out.println("Informe o desconto do produto");
		double desconto = teclado.nextDouble();
		
		Cliente c = new Cliente(produto);
		c.calcularPrecoFinal(desconto);
		
	}
}
