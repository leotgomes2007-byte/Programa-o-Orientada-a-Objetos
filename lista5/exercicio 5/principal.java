package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 String nome;
		 String cargaHoraria;
		 String nomeProfessor;
		
		disciplina d = new disciplina();
		
		System.out.println("Informe Nome da disciplina:");
		nome = teclado.nextLine();
		System.out.println("Informe carga horaria da disciplina:");
		cargaHoraria = teclado.nextLine();
		System.out.println("Informe Nome do professor da disciplina:");
		nomeProfessor = teclado.nextLine();
		
		d.atribuirValores(nome, cargaHoraria, nomeProfessor);
		
		d.exibir();
	}

}
