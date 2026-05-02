package projeto;

import java.util.Scanner;

public class listaRevisao1Exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 String titulo;
		 int duracao; //(em minutos)
		 int classificacaoEtaria;
		 int idade;
		
		System.out.println("Digite o titulo do filme : ");
		titulo = teclado.nextLine();
		System.out.println("Digite  a duração do filme(em minutos):  ");
		duracao = teclado.nextInt();
		System.out.println("Digite  a classificação etaria do filme : ");
		classificacaoEtaria = teclado.nextInt();
		
		Filme f = new Filme(titulo,duracao,classificacaoEtaria);

		System.out.println("O filme tem duração em horas:"+f.converterDuracaoHoras());
		
		System.out.println("Informe a sua idade:");
		idade = teclado.nextInt();
		
		if(f.podeAssistir(idade) == false) {
			System.out.println("Não pode assistir");
		}else {
			System.out.println("Pode assistir");
		}
		f.descricaoFilme();
	}

}
