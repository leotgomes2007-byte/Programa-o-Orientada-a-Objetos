package project;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        
        try {
            divide(n1, n2);
        } catch (MinhaExcecao e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        sc.close();
    }

    private static void divide(double n1, double n2) throws MinhaExcecao {
        if (n2 == 0) {
            throw new MinhaExcecao("Impossível realizar divisão por 0");
        } else {
            System.out.println("O resultado da divisão é: " + (n1 / n2));
        }
    }
}
