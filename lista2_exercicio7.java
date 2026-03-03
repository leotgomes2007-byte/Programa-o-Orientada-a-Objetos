package jkg;

import java.util.Scanner;

public class lista2_exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota;
	
		System.out.println("Informe as notas dos alunos(digite -1 para sair):");
		
		int i = 0;
		do {
			System.out.println("informe a nota do aluno: "+i);
			nota = teclado.nextFloat();
			System.out.println("A nota do aluno foi " + nota);
			
			i++;
		}
		while(nota != -1);
	}

}
