package project;

import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) {
	ArrayList<Livro> meusLivros = new ArrayList<>();
	
	meusLivros.add(new Livro("Dom Casmurro", "Machado de Assis"));
    meusLivros.add(new Livro("O Alquimista", "Paulo Coelho"));
    meusLivros.add(new Livro("Ensaio sobre a Cegueira", "José Saramago"));
    
	Biblioteca b = new Biblioteca();
	
	b.imprimirListaDeLivros(meusLivros);
	}

}
