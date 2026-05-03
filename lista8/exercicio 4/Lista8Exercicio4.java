package projeto;

import java.util.Scanner;

public class Lista8Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Testando o Notebook
        System.out.print("Digite a marca do Notebook: ");
        String marcaNote = sc.nextLine();
        Notebook meuNote = new Notebook(marcaNote);

        System.out.println("--- Dados do Notebook ---");
        System.out.println("Marca: " + meuNote.exibeMarca());
        System.out.println("Modelo: " + meuNote.exibeModelo());

        System.out.println("\n--------------------------\n");

        // 2. Testando o Netbook
        System.out.print("Digite a marca do Netbook: ");
        String marcaNet = sc.nextLine();
        Netbook meuNet = new Netbook(marcaNet);

        System.out.println("--- Dados do Netbook ---");
        System.out.println("Marca: " + meuNet.exibeMarca());
        System.out.println("Modelo: " + meuNet.exibeModelo());

        sc.close();
    }
}
