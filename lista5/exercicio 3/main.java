package projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		String nome;
		String email;
		String dataNascimento;
		String endereço;
		int contarAdm = 0;
		boolean testeEmail;
		boolean admin = false ;
		
		System.out.println("--pessoa 1-- ");
		System.out.println("Nome:");
		nome = teclado.nextLine();
		
		System.out.println("Email:");
		email = teclado.nextLine();
		
		System.out.println("Data de Nascimento:");
		dataNascimento = teclado.nextLine();

		System.out.println("endereço:");
		endereço = teclado.nextLine();

		if(contarAdm == 0){
			System.out.println("Deseja promover o usuario informado para Admitistrador se sim(true) se não(false):");
			admin = teclado.nextBoolean();
			contarAdm = 1;
		}
		
		System.out.println("O Email informado foi "+email+", está correto?(true = sim, false = não)");
		testeEmail = teclado.nextBoolean();
		
		if(testeEmail == false) {
			System.out.println("Informe o Email correto:");
			email = teclado.nextLine();
		}
		
		
		p.atribuirValores(nome, email, dataNascimento, endereço, admin);
		
	
		Pessoa p2 = new Pessoa();
		
		System.out.println("--pessoa 2-- ");
		System.out.println("Nome:");
		nome = teclado.nextLine();
		
		System.out.println("Email:");
		email = teclado.nextLine();
		
		System.out.println("Data de Nascimento:");
		dataNascimento = teclado.nextLine();

		System.out.println("endereço:");
		endereço = teclado.nextLine();

		if(contarAdm == 0){
			System.out.println("Deseja promover o usuario informado para Admitistrador se sim(true) se não(false):");
			admin = teclado.nextBoolean();
			contarAdm = 1;
		}
		
		System.out.println("O Email informado foi "+email+", está correto?(true = sim, false = não)");
		testeEmail = teclado.nextBoolean();
		
		if(testeEmail == false) {
			System.out.println("Informe o Email correto:");
			email = teclado.nextLine();
		}
		
		
		p2.atribuirValores(nome, email, dataNascimento, endereço, admin);

		p.exibir();
		
		
		
	}

}
