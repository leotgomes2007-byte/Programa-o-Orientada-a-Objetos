package pkg;

import java.util.Arrays;
import java.util.Scanner;

public class lista1_exercicio6 {

	public static void main(String[] args) {
		float[] numeros = new float[3];
		
		Scanner teclado = new Scanner(System.in); 
		
		for(int i = 0;i < 3;i++) {
			System.out.println("informe o valor "+ i+" para a comparação");
			numeros[i] = teclado.nextFloat();
		}
		
		Arrays.sort(numeros);
		System.out.println("o vetor organizado em ordem cressente fica:");
		
		for(int i = 0;i < 3;i++) {
		System.out.println(numeros[i]);	
		}

}
}
