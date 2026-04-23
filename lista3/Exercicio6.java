package exercicios;

import java.util.Scanner;

public class lista3Exercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] cidade = new String[5];
        float[] populacao = new float[5];

        System.out.println("Informe o nome da cidade e sua população:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Cidade " + i + ":");
            cidade[i] = teclado.next();

            System.out.println("População da cidade " + i + ":");
            populacao[i] = teclado.nextFloat();
        }

        float maior = populacao[0];
        int idMaior = 0;

        for (int i = 1; i < 5; i++) {
            if (populacao[i] > maior) {
                maior = populacao[i];
                idMaior = i;
            }
        }

        System.out.println("Cidade com maior população: " + cidade[idMaior]);
        System.out.println("População: " + populacao[idMaior]);

    }
}
