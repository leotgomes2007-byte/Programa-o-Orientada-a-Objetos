package pkg;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		//printf
		System.out.println("Olá mundo");
		System.out.println("teste");
		
		//aparecer na tela e atribuição
		int idade;
		idade = 18;
		System.out.println("a idade é "+idade);
		System.out.println("o individuo tem "+idade+" anos");
		
		//tipos de variaveis
		char c ='r';
		System.out.println("o char:"+c);
		float f = 3.14f;
		System.out.println("o float:"+f);
		double d = 3.141516;
		System.out.println("o double:"+d);
	
		//scanf string
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite seu nome:");
		nome = teclado.nextLine();
		System.out.println("o nome digitado: "+nome);
		
		//scanf int
		int n;
		System.out.println("digite um numero inteiro:");
		n = teclado.nextInt();
		System.out.println("o numero digitado:"+n);
		
		//scanf float
		
		float l;
		System.out.println("digite um numero float");
		l = teclado.nextFloat();
		System.out.println("o numero float digiado:"+l);
		
		//scanf double
		double p;
		System.out.println("digite um numero double:");
		p = teclado.nextDouble();
		System.out.println("o numero double digitado:"+p);
		
		
		// if/else
		System.out.println("digite uma idade:");
		idade = teclado.nextInt();
		if(idade >= 18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
		
		// switch
		int opcao;
		
		System.out.println("Digite um aopção");
		System.out.println("digite 1 para cadastrar");
		System.out.println("digite 2 para colsultar");
		System.out.println("digite 3 para sair");
		opcao = teclado.nextInt();
				switch(opcao) {
				case 1:
					System.out.println("aqui vou cadastrar");
					break;
					
				case 2:
					System.out.println("aqui vou soncultar");
					break;
					
				case 3:
					System.out.println("aqui vou sair");
					break;
					
					default:
						System.out.println("Digite uma operação válida");
				}
	
	}

}
