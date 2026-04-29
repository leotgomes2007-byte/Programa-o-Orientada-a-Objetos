package project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		
		Cachorro c = new Cachorro();
		c.setIdade (80);
		c.setNome("Jacinto");
		c.setSom("miau");
		c.exibir();
		
		System.out.println("teste latir:");
		c.latir();
	}

}
