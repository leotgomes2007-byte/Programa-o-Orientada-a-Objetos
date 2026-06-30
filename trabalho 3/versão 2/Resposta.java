import java.io.Serializable;

public class Resposta implements Serializable {
    private boolean sucesso;
    private String mensagem;

    public Resposta(boolean sucesso, String mensagem) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }
}
