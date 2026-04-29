package pkg;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Livro l1 = new Livro();
		
		System.out.println("--Informe os dados do livro--");
		
		System.out.println("Titulo:");
		l1.Titulo = teclado.nextLine();
		System.out.println("Autor:");
		l1.Autor = teclado.nextLine();
		System.out.println("Ano de Publicação:");
		l1.AnoPublicação = teclado.nextInt();
	
		System.out.println("--Livro 1 instanciado--");
		System.out.println("nome:"+l1.Titulo);
		System.out.println("Autor:"+l1.Autor);
		System.out.println("AnoPublicação:"+l1.AnoPublicação);
	
	}

}
