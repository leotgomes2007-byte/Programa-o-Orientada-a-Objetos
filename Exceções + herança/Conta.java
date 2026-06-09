package project;

public abstract class Conta {
    protected double saldo;
    protected double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public abstract void depositar(double valor) throws SaldoInsuficienteException;
    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public double getSaldo() {
        return saldo;
    }
}
