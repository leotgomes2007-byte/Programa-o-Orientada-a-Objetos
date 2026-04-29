package projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Livro l = new Livro();
		
		String titulo;
		String autor;
		String anoPublicacao;
		String genero;
		boolean emprestado;
		
		System.out.println("--Livro 1-- ");
		System.out.println("Titulo:");
		titulo = teclado.nextLine();
		
		System.out.println("Autor:");
		autor = teclado.nextLine();
		
		System.out.println("Ano de publicação:");
		anoPublicacao = teclado.nextLine();

		System.out.println("Gênero:");
		genero = teclado.nextLine();

		System.out.println("Foi emprestado(True ou False):");
		emprestado = teclado.nextBoolean();
		
		l.atribuirValores(titulo, autor, anoPublicacao, genero, emprestado);
		
		if(emprestado == false) {
		System.out.println("quer fazer o emprestimo do livro informado(True ou false):");
		emprestado = teclado.nextBoolean();
		l.atribuirValores(titulo, autor, anoPublicacao, genero, emprestado);
			if(emprestado == true) {
				System.out.println("Devolva em 7 dias");
			}
		}

		l.exibir();
		
		
		
	}

}
