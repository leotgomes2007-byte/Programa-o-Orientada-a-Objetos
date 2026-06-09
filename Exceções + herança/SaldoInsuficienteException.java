package project;

public class SaldoInsuficienteException extends IllegalArgumentException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
