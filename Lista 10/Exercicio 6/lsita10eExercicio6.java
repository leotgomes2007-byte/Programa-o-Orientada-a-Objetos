package project;

import java.util.Scanner;

public class lsita10eExercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do salario");
		double salario = teclado.nextDouble();
		
		System.out.println("Informe o nome do funcionario");
		String nome = teclado.nextLine();
		
		System.out.println("Informe o valor do percentual de aumento em %");
		double percentual = teclado.nextDouble();
		
		Funcionario f = new Funcionario(nome,salario);
		f.aumentarSalario(percentual);
		
		System.out.println("Informe o valor do Bonus do gerente");
		double bonus = teclado.nextDouble();
		
		Gerente g = new Gerente(nome,salario,bonus);
		g.aumentarSalario();
		
		System.out.println("Informe a quantidade de horas extras do desenvolvedor");
		double horas = teclado.nextDouble();
		
		Desenvolvedor d = new Desenvolvedor(nome,salario,horas);
		d.aumentarSalario();
	}

}
