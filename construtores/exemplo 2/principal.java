package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Carro c1 = new Carro("VW","Fusca");
		System.out.println("Marca do carro:"+c1.marca);
		System.out.println("modelo do carro:"+c1.modelo);

		String Marca,Modelo;
		
		System.out.println("Digite a marca do carro: ");
		Marca = teclado.nextLine();
		System.out.println("Digite a modelo do carro: ");
		Modelo = teclado.nextLine();
		
		Carro c2 = new Carro(Marca,Modelo);
		
		System.out.println("Marca do carro:"+c2.marca);
		System.out.println("modelo do carro:"+c2.modelo);
		
		System.out.println("Informe a marca e modelo do carro 2: ");
		Carro c3 = new Carro(teclado.nextLine(),teclado.nextLine());
		
		System.out.println("Marca do carro:"+c3.marca);
		System.out.println("modelo do carro:"+c3.modelo);
	
		Carro c4 = new Carro("Ford");
		System.out.println("marca do carro 4:"+c4.marca);
	}
	

}
