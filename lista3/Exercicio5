package exercicios;

import java.util.Scanner;

public class lista3Exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numero = new int[10];
        int menor, maior;

        System.out.println("Informe dez numeros inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + i + ":");
            numero[i] = teclado.nextInt();
        }

        menor = numero[0];
        maior = numero[0];

        for (int i = 1; i < 10; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }

            if (numero[i] > maior) {
                maior = numero[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
