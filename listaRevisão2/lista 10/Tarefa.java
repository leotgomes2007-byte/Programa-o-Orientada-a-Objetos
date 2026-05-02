package projeto;

public class Tarefa {
    public String descricao;
    public boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    public void exibirTarefa() {
        System.out.println("Descrição: " + descricao);
        if (concluida) {
            System.out.println("Status: [Concluída]");
        } else {
            System.out.println("Status: [Pendente]");
        }
        System.out.println("--------------------");
    }
}
