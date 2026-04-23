package projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Não deixa os dados entratem na classe 
//		Pessoa p = new Pessoa();
//		p.nome = "Ricardo";
//		p.idade = 40;
		
	Pessoa p = new Pessoa("Ricardo",40);
//	String nome;
//	nome = p.getNome(); // est metodo retorna uma String com o nome
//	System.out.println("Nome:"+ nome);
	System.out.println("Nome: "+p.getNome());
	System.out.println("Idade:"+ p.getIdade());
	
	System.out.println("Digite o novo nome:" );
	String nome = teclado.nextLine();
	p.setNome(nome);
	System.out.println("Novo nome:"+ p.getNome());
	
	System.out.println("Digite a nova idade: ");
	int idade = teclado.nextInt();
	p.setIdade(idade);
	System.out.println("nova idade: "+p.getIdade());	
	}
}
