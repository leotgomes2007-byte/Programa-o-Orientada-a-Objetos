package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista6Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
        int numero1;
        int numero2;
       try { 
        System.out.println("Informe o primeiro numero");
        numero1 = teclado.nextInt();    	

        System.out.println("Informe o segundo numero");
        numero2 = teclado.nextInt();
        
        System.out.println("Adição:"+ (numero1+numero2));
        System.out.println("Subtração:"+ (numero1-numero2));
        System.out.println("Multiplicação:"+ (numero1*numero2));
        System.out.println("Divisão:"+ (numero1/numero2));
       }catch(InputMismatchException e) {
    	   System.out.println("Erro:use numeros inteiros");
       }catch(ArithmeticException e) {
    	   System.out.println("Erro, não é possivel dividir por 0");
       }
        
}
}