package pkg;

import java.util.Scanner;

public class lista1_exerccio8 {

	public static void main(String[] args) {
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe sua idade para saber a sua situação eleitoral:");
		idade = teclado.nextInt();
		
		if(idade < 16) {
			System.out.println("não está apta a votar.");
		}else if(idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("voto é facultativo.");
		}else {
			System.out.println("voto é obrigatório.");
		}
	}

}
