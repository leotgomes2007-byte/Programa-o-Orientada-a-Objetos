package project;

import java.util.Scanner;

public class listaRevisao1Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.println("Digite a nota 1: ");
		float n1 = teclado.nextFloat();
		System.out.println("Digite a nota 2: ");
		float n2 = teclado.nextFloat();
		System.out.println("Digite a nota 3: ");
		float n3 = teclado.nextFloat();
		
		a1.calcularMedia(n1, n2, n3);
		a1.maiorNota(n1, n2, n3);
		a1.menorNota(n1, n2, n3);
		
		if(a1.aprovado() == false) {
			System.out.println("reprovado");
		}else {
			System.out.println("aprovado");
		}


	}
}
