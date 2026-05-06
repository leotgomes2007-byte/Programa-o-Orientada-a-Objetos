package projeto;

import java.util.Scanner;

public class Lista9Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();

        String mensagem;
        int repeticoes;
        
        System.out.println("Informe a mensagem");
        mensagem = teclado.nextLine();
        
        System.out.println("Informe a quantidade de repetições");
        repeticoes = teclado.nextInt();
        
        System.out.println("Mensagem:");
        p.falar(mensagem);
        System.out.println("Mensagem + Repetições:");
        p.falar(mensagem,repeticoes);

    }
}
