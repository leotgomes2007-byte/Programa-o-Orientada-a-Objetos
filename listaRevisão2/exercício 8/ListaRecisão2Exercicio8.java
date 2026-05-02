package projeto;

import java.util.Scanner;

public class ListaRecisão2Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--Informe os dados de Cadastro--");
        System.out.print("Nome de Usuario: ");
        String nome = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();

        Usuario u = new Usuario(nome, senha);

        System.out.println("\n--Informe os dados de login--");
        System.out.print("Nome de Usuario: ");
        String loginNome = teclado.nextLine();
        System.out.print("Senha: ");
        String loginSenha = teclado.nextLine();

        u.login(loginNome, loginSenha);

        if (u.logado) {
            System.out.println("Deseja deslogar? (SIM ou NÃO)");
            String resposta = teclado.nextLine().toUpperCase();
            u.logout(resposta); 
        }

        u.exibirStatus();
        teclado.close();
    }
}
