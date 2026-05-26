package project;

public class NotificacaoEmail {
	
	public void enviar(String mensagem[],String destinatario[],int quantidade) {
		
		for(int i = 0;i < quantidade;i++) {
		System.out.println("Notificação Email");
		System.out.println("A mensagem"+mensagem[i]+"foi enviada para o destinatario"+destinatario[i]);
		}
	}
}
