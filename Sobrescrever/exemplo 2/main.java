package project;

import java.util.Scanner;

public class main {
	public static void main(String[] arg) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para Pessoa:");
		System.out.println("Digite 2 para Programador:");
		int op = teclado.nextInt();
		if(op ==1) {
			Pessoa pes = new Pessoa();
			pes.trabalhar();
		}else if(op ==2) {
			Programador p = new Programador();
			p.trabalhar();
		}
	}
}
