package projeto;

import java.util.Scanner;

public class listaRevisao1Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 String nome;
		 int golssofridos; 
		 int golsmarcados;
		 int gols;
		
		System.out.println("Nome do time : ");
		nome = teclado.nextLine();
		System.out.println("Gols marcados:  ");
		golssofridos = teclado.nextInt();
		System.out.println("Gols sofridos : ");
		golsmarcados = teclado.nextInt();
		
		Time t = new Time(nome,golssofridos,golsmarcados);
		
		System.out.println("Informe se o time quantos gols o time fez");
		gols = teclado.nextInt();
		t.marcarGol(gols);

		System.out.println("Informe se o time quantos gols o time Sofreu");
		gols = teclado.nextInt();
		t.sofridosGol(gols);
		
		 t.resultadoPartida();
		
	}
}
