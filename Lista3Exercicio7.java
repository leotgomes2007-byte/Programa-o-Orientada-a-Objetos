package src;

import java.util.Scanner;

public class Lista3Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float[][] nota = new float[3][4]; // 3 alunos, 4 disciplinas
        float[] maior = new float[4];
        float[] menor = new float[4];
                
        System.out.println("Informe a nota dos alunos:");
        
        // 1. Leitura dos valores
        for(int i = 0; i < 3; i++) {
            System.out.println("Aluno " + i + ":");
            for(int j = 0; j < 4; j++) {
                System.out.print("Disciplina " + j + ": ");
                nota[i][j] = teclado.nextFloat();
            }
        }
        
        // 2. Processamento por DISCIPLINA (j)
        for(int j = 0; j < 4; j++) {
            // Inicializamos o maior e menor com a nota do primeiro aluno (0) nesta disciplina (j)
            maior[j] = nota[0][j];
            menor[j] = nota[0][j];
            
            for(int i = 1; i < 3; i++) { // Começamos do aluno 1
                if(nota[i][j] > maior[j]) {
                    maior[j] = nota[i][j];
                }
                if(nota[i][j] < menor[j]) {
                    menor[j] = nota[i][j];
                }
            }
        }
        
        System.out.println("\n--- Resultados ---");
        // 3. Exibição dos resultados (são 4 disciplinas)
        for(int j = 0; j < 4; j++) {
            System.out.println("Disciplina " + j + ": Maior = " + maior[j] + " | Menor = " + menor[j]);
        }
        
    }
}