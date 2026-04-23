package jkg;

import java.util.Scanner;

public class exemploVetorMatriz {

    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//for com atribuição
    	int [] vetor = new int[5];
    	vetor[0] = 5;
    	vetor[1] = 10;
    	vetor[2] = 15;
    	vetor[3] = 20;
    	vetor[4] = 25;
    	
    	for(int i = 0; i < vetor.length;i++) {
    		System.out.println("Digite o elemento"+i+":");
    		vetor[i] = teclado.nextInt();
    	}
    	
    	//lendo o for
    	for(int i = 0; i < vetor.length;i++) {
    		System.out.println("Elemento "+ i +"="+vetor[i]);
    
    	}
    	
    	//matriz
    	
    	int[][] matriz = new int [2][2];
    		for(int i = 0; i < 2;i++ ) {
    			for(int j = 0; j < 2;j++ ) {
    			System.out.println("digite o elemento["+i+"]["+j+"]");
    				matriz[i][j] = teclado.nextInt();
    			}	
    		}
    		
    		for(int i = 0; i < matriz.length;i++ ) {
    			for(int j = 0; j <  matriz.length;j++ ) {
    			System.out.println("elemento["+i+"]["+j+"]="+matriz[i][j]+"\t");
    			}	
    		}
    		}
}
