package pkg;

import java.util.Scanner;

public class lista1_exercicio5 {

	public static void main(String[] args) {
		float[] numeros = new float[3];
		float maior = -1;
		
		Scanner teclado = new Scanner(System.in); 
		
		for(int i = 0;i < 3;i++) {
			System.out.println("informe o valor "+ i+" para a comparação");
			numeros[i] = teclado.nextFloat();
			
			if(numeros[i] > maior) {
				maior = numeros[i];
		}
		}
		
		System.out.println("O maior valor dentre os numeros informados é o " +maior);
		
	}

}
