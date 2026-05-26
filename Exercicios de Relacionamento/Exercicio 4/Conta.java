package project;

public class Conta {
    private String titular;
    private float saldo;

    // Construtor
    public Conta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // O método foi movido para DENTRO da classe
    // Ajustado para SOMAR o valor ao saldo existente (Passagem por referência)
    public static void deposito(Conta c, float valor) {
        float novoSaldo = c.getSaldo() + valor; 
        c.setSaldo(novoSaldo);
    }
}
