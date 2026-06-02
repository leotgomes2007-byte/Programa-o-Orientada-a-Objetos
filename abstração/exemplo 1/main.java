package poeject;

import java.util.Scanner;

public class main {
	public static void main(String[]arg) {
	Scanner teclado = new Scanner(System.in);
	//Animal a = new Animal();
//	Cachorro c = new Cachorro();
//	c.emiteSom();
//	Tigre t = new Tigre();
	
	int op;
	System.out.println("Digite 1 para instanciar um cachorro");
	System.out.println("Digite 2 para instanciar um tigre ");
	op = teclado.nextInt();
	if(op == 1) {
		Cachorro a = new Cachorro();
		a.especie = "cuscus";
		a.idade = 5;
		a.raca = "pincher";
		a.emiteSom();
		a.exibeInfo();
		a.cuidarPatio();
		
	} else {
		Tigre a = new Tigre();
		a.especie = "Tigrão";
		a.idade = 8;
		a.emiteSom();
		a.exibeInfo();	}
	}
}
