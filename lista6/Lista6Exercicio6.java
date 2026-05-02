package project;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lista6Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
        double premio = 5000.0;
        int QtsPessoa;
        
        try {
            System.out.println("Informe quantas pessoas vão dividir o premio:");
            QtsPessoa = teclado.nextInt();
            
            System.out.println("Valor que cada pessoa vai ganhar do premio: " + premio / QtsPessoa);
            
        } catch (ArithmeticException e) {
            System.out.println("ERRO: não é possível fazer divisão por 0");
            
        } catch (InputMismatchException e) {
            System.out.println("ERRO: digite um número inteiro");
        }
        
    }
}