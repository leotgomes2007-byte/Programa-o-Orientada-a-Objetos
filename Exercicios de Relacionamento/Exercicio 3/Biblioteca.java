package project;

import java.util.ArrayList;

public class Biblioteca {
	
	public void imprimirListaDeLivros(ArrayList<Livro> lista) {
        System.out.println("====== LIVROS NA BIBLIOTECA ======");
        
        // Laço "for-each" para percorrer cada livro dentro da lista
        for (Livro livro : lista) {
            System.out.println("titulo:"+livro.getTitulo()+"- Autor: "+livro.getAutor()); // Chama o toString() do livro automaticamente
        }
        
        System.out.println("==================================");
    }
}

