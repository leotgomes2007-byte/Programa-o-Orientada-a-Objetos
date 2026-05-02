package projeto;

public class Usuario {
    public String nomeUsuario;
    public String senha;
    public boolean logado;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void login(String usuario, String senha) {
        if (usuario.equals(this.nomeUsuario) && senha.equals(this.senha)) {
            logado = true;
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos.");
            logado = false;
        }
    }

    public void logout(String resposta) {
        if (resposta.equals("SIM")) {
            logado = false;
            System.out.println("Você deslogou.");
        } else if (!resposta.equals("NÃO") && !resposta.equals("NAO")) {
            System.out.println("ERRO: Valor inválido.");
        }
    }

    public void exibirStatus() {
        if (logado) {
            System.out.println("Status: Usuário logado.");
        } else {
            System.out.println("Status: Usuário deslogado.");
        }
    }
}
