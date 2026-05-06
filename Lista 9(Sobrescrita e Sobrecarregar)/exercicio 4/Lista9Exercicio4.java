package projeto;

import java.util.Scanner;

public class Lista9Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Casa c = new Casa();
		
		double valor,tamanho;
		int quarto;
		
        System.out.println("Informe a valor");
        valor = teclado.nextDouble();
        
        System.out.println("Informe a tamanho");
        tamanho = teclado.nextDouble();
        
        System.out.println("Informe a quantidade de quarto");
        quarto = teclado.nextInt();
        
        System.out.println("Calcular Preço da casa: "+c.calcularPreco(tamanho, valor));
        
        System.out.println("Calcular Preço da casa com quartos: "+c.calcularPreco(tamanho, valor,quarto));

	}
}
