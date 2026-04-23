package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno();
		a1.nome = "Estevan";
		a1.matricula = "102030";
		a1.cpf = "852.521.240.04";
		
		System.out.println("informe a idade da pessoa 1:");
		a1.idade = teclado.nextInt();
		
		teclado.nextLine();

		Aluno a2 = new Aluno();
		a2.nome = "Leonardo";
		a2.matricula = "302010";
		a2.cpf = "750.240.852.04";
		
		System.out.println("informe a idade da pessoa 2:");
		a2.idade = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("--aluno 1 instanciado--");
		System.out.println("nome:"+a1.nome);
		System.out.println("Matricula:"+a1.matricula);
		System.out.println("CPF:"+a1.cpf);
		System.out.println("Idade:"+a1.idade);

		System.out.println("--Aluno 2 instanciado--");
		System.out.println("nome:"+a2.nome);
		System.out.println("Matricula:"+a2.matricula);
		System.out.println("CPF:"+a2.cpf);
		System.out.println("Idade:"+a2.idade);

		
		Aluno a3 = new Aluno();
		
		System.out.println("--aluno 3 instanciado--");
		System.out.println("informe o nome:");
		a3.nome = teclado.nextLine();

		
		System.out.println("informe o Matricula:");
		a3.matricula = teclado.nextLine();
		
		System.out.println("informe o CPF:");
		a3.cpf = teclado.nextLine();
		
		System.out.println("informe a idade:");
		a3.idade = teclado.nextInt();
		
		System.out.println("--aluno 3 instanciado--");
		System.out.println("nome:"+a3.nome);
		System.out.println("Matricula:"+a3.matricula);
		System.out.println("CPF:"+a3.cpf);
		System.out.println("Idade:"+a3.idade);
	}

}
