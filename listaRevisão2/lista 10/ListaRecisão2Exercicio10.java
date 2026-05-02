package projeto;

import java.util.Scanner;

public class ListaRecisão2Exercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Tarefa[] listaDeTarefas = new Tarefa[3];

        System.out.println("-- Cadastro de Tarefas --");
        for (int i = 0; i < listaDeTarefas.length; i++) {
            System.out.print("Digite a descrição da tarefa " + (i + 1) + ": ");
            String desc = teclado.nextLine();
            
            listaDeTarefas[i] = new Tarefa(desc);
        }

        System.out.println("\nFinalizando a tarefa 2...");
        listaDeTarefas[1].concluirTarefa();

        System.out.println("\n-- Lista Atualizada --");
        for (int i = 0; i < listaDeTarefas.length; i++) {
            listaDeTarefas[i].exibirTarefa();
        }

        teclado.close();
    }
}
