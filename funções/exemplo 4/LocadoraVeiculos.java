package projeto;

import java.util.Scanner;

	public class LocadoraVeiculos {

		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			Carro c = new Carro();
			
			System.out.println("-- Carro --");
			c.atribuirValores("VW", "Gol");
			System.out.println("Dados do carro: "+c.retornaMarca()+" "+c.retornaModelo()+"");
			
			System.out.println("-- Moto --");
			String marca,modelo,cilindrada;
			Moto m1 = new Moto();
			
			System.out.println("Informe a marca da moto:");
			marca = teclado.nextLine();
			
			System.out.println("Informe a modelo da moto:");
			modelo = teclado.nextLine();
			
			System.out.println("Informe a cilindrada da moto:");
			cilindrada = teclado.nextLine();
			
//			MINHA GABIARRA
//			System.out.println("-- Moto 1 --");
//			System.out.println("Marca,modelo,Cilindrada");
//			m1.atribuirValores(teclado.nextLine(),teclado.nextLine(),teclado.nextLine());
			
			
			System.out.println("Dados da Moto1: "+m1.retornaMarca()+" "+m1.retornaModelo()+""+ m1.retornaCilindrada());
		
		}

	}

