package jkg;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		//testando variasveis s sysout(s);
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um interio:");
		int n = teclado.nextInt();
		System.out.println("Digite um double:");
		double n1 = teclado.nextDouble();
		System.out.println("Double digitado:" + n1);
		teclado.nextLine();
		String palavra = teclado.nextLine();
		System.out.println("Palavra digitada:"+ palavra);
		palavra = teclado.next();
		System.out.println("Palavra diitada com .next:"+ palavra);
		
		//testando o for
		for(int i = 0; i < 10; i++) {
			//o i existira somente aqui dentro;
			System.out.println("i vale " +i);
		}
		
		//testando while
		int i = 0; //incializando variavel
		while(i<10) { //o critério de parada;
			System.out.println("I vale com while:" + i);
			i++; //incremento
		}
		
		//testando do/while
		i = 0;
		do {
			System.out.println("i vale com do while " +i);
			i++;
		}while(i < 10);
		}
	}


