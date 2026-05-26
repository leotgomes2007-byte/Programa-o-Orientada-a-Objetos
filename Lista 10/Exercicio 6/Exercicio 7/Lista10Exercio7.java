package project;

import java.util.Scanner;

public class Lista10Exercio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a mensagem");
		String mensagem = teclado.nextLine();
		
		System.out.println("Informe destinatario");
		String destinatario = teclado.nextLine();
		
		Notificacao n = new Notificacao();
		n.enviar(mensagem, destinatario);
		
		System.out.println("Informe a quantidade de destinatarios");
		int quantidade = teclado.nextInt();

		String mensagemV [] = new String[quantidade];
		String destinatarioV [] = new String[quantidade];

		teclado.nextLine();
		
		for(int i = 0;i < quantidade;i++) {
			System.out.println("Informe a mensagem");
			 mensagemV[i] = teclado.nextLine();
				teclado.nextLine();
			 
			System.out.println("Informe destinatario");
			 destinatarioV[i] = teclado.nextLine();
				teclado.nextLine();
			 
		}
		NotificacaoEmail e = new NotificacaoEmail();
		e.enviar(mensagemV, destinatarioV,quantidade);
		
		
		System.out.println("Informe a mensagem");
		 mensagem = teclado.nextLine();
		
		System.out.println("Informe destinatario");
		 destinatario = teclado.nextLine();
		
		NotificacaoApp a = new NotificacaoApp();
		a.enviar(mensagem, destinatario);
		
	}

}
