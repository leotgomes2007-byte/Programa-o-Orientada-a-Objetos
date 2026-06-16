package project;

import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        // Criando objetos Aluno (Slide 16)
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Alziras", 19);
        
        List<Aluno> lista = new ArrayList<>();
        
        Arquivos arquivo = new Arquivos("alunos");
        
        arquivo.gravaArquivo(aluno1);
        arquivo.gravaArquivo(aluno2);
        arquivo.gravaArquivo(aluno3);
        
        lista = arquivo.leArquivo();
        
        for (Aluno a : lista) {
            System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}
