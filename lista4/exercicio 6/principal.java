package pkg;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		//leitura dos dados
		System.out.println("--Informe os dados do Produto--");
		
		System.out.println("Nome:");
		a1.Nome = teclado.nextLine();
		System.out.println("Matricula:");
		a1.Matricula = teclado.nextLine();
		System.out.println("Primeira Nota:");
		a1.Nota1 = teclado.nextFloat();
		System.out.println("Segunda Nota:");
		a1.Nota2 = teclado.nextFloat();
		System.out.println("Terceira Nota:");
		a1.Nota3 = teclado.nextFloat();
	
		//calculo da media
		a1.Media = (a1.Nota1+ a1.Nota2+ a1.Nota3)/3;
		
		//exibir produto
		System.out.println("--Aluno 1 instanciado--");
		System.out.println("nome:"+a1.Nome);
		System.out.println("Matricula:"+a1.Matricula);
		System.out.println("Primeira nota:"+a1.Nota1);
		System.out.println("Segunda nota:"+a1.Nota2);
		System.out.println("Terceira nota:"+a1.Nota3);
		System.out.println("A Média:" + a1.Media);
	
		if(a1.Media >= 6) {
			System.out.println("Aluno informado foi Aprovado");			
		}else {
			System.out.println("Aluno informado foi reprovado");
		}
	
	}

}
