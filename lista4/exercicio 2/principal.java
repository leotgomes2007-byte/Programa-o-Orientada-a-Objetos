package lista4Exercicio2;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		computador c1 = new computador();

		computador c2 = new computador();

		System.out.println("--Informe os dados do computador--");
	
		System.out.println("marca:");
		c2.marca = teclado.nextLine();
		System.out.println("Modelo:");
		c2.modelo = teclado.nextLine();
		System.out.println("tipo:");
		c2.tipo = teclado.nextLine();
		System.out.println("preco:");
		c2.preco = teclado.nextLine();
		
System.out.println("--informaões do carro 2--");
		
		System.out.println("marca:"+c2.marca);
		System.out.println("Modelo:"+c2.modelo);
		System.out.println("Tipo:"+c2.tipo);
		System.out.println("preço:"+c2.preco);

		
System.out.println("--informaões do computador 1--");
		
		System.out.println("marca:"+c1.marca);
		System.out.println("Modelo:"+c1.modelo);
		System.out.println("tipo:"+c1.tipo);
		System.out.println("preço"+c1.preco);
		
System.out.println("--informaões do computador 2--");
		
		System.out.println("marca:"+c2.marca);
		System.out.println("Modelo:"+c2.modelo);
		System.out.println("tipo:"+c2.tipo);
		System.out.println("preço"+c2.preco);

	}

}
