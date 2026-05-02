package projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 String nome;
		 String matricula;
		 int anoIngresso;
		 String dataNascimento;
		 
		 System.out.println("--Objeto 1--");
		 System.out.println("Nome:");
		 nome = teclado.nextLine();
		 System.out.println("matricula:");
		 matricula = teclado.nextLine();
		 
		 Aluno a1 = new Aluno(nome,matricula);
		 
		 teclado.nextLine();
		 
		 System.out.println("--Objeto 2--");
		 System.out.println("data de nascimento:");
		 dataNascimento = teclado.nextLine();
		 
		 Aluno a2 = new Aluno(dataNascimento);
		 
		 teclado.nextLine();
		 
		 System.out.println("--Objeto 1--");
		 System.out.println("Nome:");
		 nome = teclado.nextLine();
		 System.out.println("data de nascimento:");
		 dataNascimento = teclado.nextLine();
		 System.out.println("ano de ingresso:");
		 anoIngresso = teclado.nextInt();
		 
		 Aluno a3 = new Aluno(nome,dataNascimento,anoIngresso);
	}

}
