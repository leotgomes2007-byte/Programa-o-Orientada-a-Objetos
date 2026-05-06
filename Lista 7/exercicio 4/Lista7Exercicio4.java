package projeto;

import java.util.Scanner;

public class Lista7Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Carro c = new Carro(null,null,0);
				
		System.out.println("Informe o modelo do carro:");
		String modelo = teclado.nextLine();
		c.setModelo(modelo);
		
		System.out.println("Informe a marca do carro:");
		String marca = teclado.nextLine();
		c.setMarca(marca);
		
		System.out.println("Informe o ano do carro:");
		int ano = teclado.nextInt();
		c.setAno(ano);
		
		c.exibeDetalhes();
	}

}
