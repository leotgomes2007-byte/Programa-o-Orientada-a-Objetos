package pkg;

import java.util.Scanner;

public class lista1_Exercicio2 {

	public static void main(String[] args) {
		
		int odometroInicio;
		int odometroFinal;
		int totalQuilometragem; 
		float litrosGasto;
		float ValorTotalRecebido;
		
		System.out.println("informe o valor do odometro no inicio do dia:");
		Scanner teclado = new Scanner(System.in);
		odometroInicio = teclado.nextInt();
		
		System.out.println("informe o valor do odometro no final do dia:");
		odometroFinal = teclado.nextInt();
		
		System.out.println("número de litros de combustível gasto:");
		litrosGasto = teclado.nextFloat();
		
		System.out.println("valor total (R$) recebido dos passageiros:");
		ValorTotalRecebido = teclado.nextFloat();
		
		totalQuilometragem = odometroFinal - odometroInicio;
		
		System.out.println("Total de quilometragem:"+totalQuilometragem);
		System.out.println("Media de comsumo:"+(totalQuilometragem/ litrosGasto));
		System.out.println("Lucro do dia:"+(ValorTotalRecebido - (litrosGasto * 4.90)));
	}

}
