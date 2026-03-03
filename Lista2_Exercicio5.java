package jkg;

import java.util.Scanner;

public class Lista2_Exercicio5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int fatorial;
        int resultado = 1;

        System.out.println("Informe um número para calcular o fatorial:");
        fatorial = teclado.nextInt();

        for (int i = 1; i <= fatorial; i++) {
            resultado *= i;
        }

        System.out.println("O resultado deu " + resultado);

        teclado.close();
    }
}