package project;

import java.util.Scanner;

public class listaRevisao1Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		float salario;
		int horaExtra,add;
		
		System.out.println("Digite o nome do funcionario: ");
		nome = teclado.nextLine();
		System.out.println("Digite o salario:");
		salario = teclado.nextFloat();
		System.out.println("Digite a quantidade de hora extra feita pelo funcionario:");
		horaExtra = teclado.nextInt();

		
		Funcionario f = new Funcionario (nome,salario,horaExtra);
		
		f.calcularValorHoraExtra();
		f.calcularPagamentoTotal();
		f.salarioAnual();

		System.out.println("Informe a quantidade de horas extra que deseja adicionar ao funcionario:");
		add = teclado.nextInt();
		System.out.println("O seu funcionario tem agora "+f.adicionarHorasExtras(add)+ " horas extras");
		

		

	}

}
