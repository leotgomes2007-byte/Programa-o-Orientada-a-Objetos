package pkg;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		pessoa p1 = new pessoa();
		
		System.out.println("--Informe os dados da pessoa--");
		
		System.out.println("Nome:");
		p1.Nome = teclado.nextLine();
		System.out.println("Gênero:");
		p1.Genero = teclado.nextLine();
		System.out.println("idade:");
		p1.Idade = teclado.nextInt();
	
		System.out.println("--pessoa 1 instanciado--");
		System.out.println("nome:"+p1.Nome);
		System.out.println("gênero:"+p1.Genero);
		System.out.println("Idade:"+p1.Idade);
	
	}

}
