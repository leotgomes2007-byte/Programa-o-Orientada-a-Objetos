package project;

import java.util.Scanner;

public class lista6Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome[] = new String[5];
		int numero;
		
		System.out.println("Informe o nomde de cinco pessoas");
		for(int i = 0; i < nome.length;i++) {
			System.out.println("Nome "+ i+":");		
			nome[i] = teclado.nextLine();
	}
		try {
		System.out.println("Informe um numero:(0 á 4):");
		numero = teclado.nextInt();
		System.out.println("O nome que ocupa o espaço de memoria "+numero+" é o "+nome[numero]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO!! numero informado inválido, informe um numero dentro do limite estabelecido");
		}
	}
}