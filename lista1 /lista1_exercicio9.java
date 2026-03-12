package pkg;

import java.util.Scanner;

public class lista1_exercicio9 {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int operacao;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe um numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("informe outro numero:");
		numero2 = teclado.nextInt();		
		
		System.out.println("Digite uma opção");
		System.out.println("digite 1 para somar");
		System.out.println("digite 2 para subtrair");
		System.out.println("digite 3 para multiplicar");
		System.out.println("digite 4 para dividir");
		System.out.println("digite 5 para fazer todas as operações");
		System.out.println("digite 6 para sair");
		operacao = teclado.nextInt();		

		
		switch(operacao) {
		case 1:
			System.out.println("Adição = "+ (numero1+numero2));
			break;
		case 2:
			System.out.println("subtração = "+ (numero1-numero2));
			break;
		case 3:
			System.out.println("multiplicação = "+ (numero1*numero2));
			break;
		case 4:
			System.out.println("divisão = "+ (numero1/numero2));
			break;
		case 5:
			System.out.println("Adição = "+ (numero1+numero2));
			System.out.println("subtração = "+ (numero1-numero2));
			System.out.println("multiplicação = "+ (numero1*numero2));
			System.out.println("divisão = "+ (numero1/numero2));
			break;
		case 6:
			System.out.println("saindo do programa");
			break;
			
			default:
				System.out.println("Valor invalido, informe um valor valido");
				break;
		}
	}

}
