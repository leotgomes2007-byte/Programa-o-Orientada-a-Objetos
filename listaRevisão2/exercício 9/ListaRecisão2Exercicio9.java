package projeto;

import java.util.Scanner;

public class ListaRecisão2Exercicio9 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);

	        System.out.println("--Informe os dados do filme--");
	        System.out.print("Titulo: ");
	        String titulo = teclado.nextLine();
	        System.out.print("diretor: ");
	        String diretor = teclado.nextLine();
	        System.out.print("genero: ");
	        String genero = teclado.nextLine();
	        System.out.print("Tempo de duracao do filme(minutos): ");
	        int duracao = teclado.nextInt();
	        
	       Filme f = new Filme(titulo,diretor,genero,duracao);
	       
	       if(f.ehLongo() == true) {
	    	   System.out.println("O filme é longo");
	       }else {
	    	   System.out.println("O filme não é longo");
	       }
	       
	       f.exibirDetalhes();
	}

}
