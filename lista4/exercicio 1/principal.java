package lista4Exercicio1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		carro c1 = new carro();
		
		System.out.println("--Informe os dados do carro 1--");
	
		System.out.println("marca:");
		c1.marca = teclado.nextLine();
		System.out.println("Modelo:");
		c1.modelo = teclado.nextLine();
		System.out.println("Ano de fabricação:");
		c1.anoFabricacao = teclado.nextLine();
		
		carro c2 = new carro();
		
		System.out.println("--Informe os dados do carro 2--");
	
		System.out.println("marca:");
		c2.marca = teclado.nextLine();
		System.out.println("Modelo:");
		c2.modelo = teclado.nextLine();
		System.out.println("Ano de fabricação:");
		c2.anoFabricacao = teclado.nextLine();
		
		System.out.println("--informaões do carro 1--");
		
		System.out.println("marca:"+c1.marca);
		System.out.println("Modelo:"+c1.modelo);
		System.out.println("Ano de fabricação:"+c1.anoFabricacao);
		
		
		System.out.println("--informaões do carro 2--");
		
		System.out.println("marca:"+c2.marca);
		System.out.println("Modelo:"+c2.modelo);
		System.out.println("Ano de fabricação:"+c2.anoFabricacao);
		
		
	}

}
