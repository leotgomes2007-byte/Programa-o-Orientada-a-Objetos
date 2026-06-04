public abstract class Conta {
    // Atributos (protected para as classes filhas acessarem diretamente)
    protected double saldo;
    protected double limite;

    public Conta(double saldoInicial, double limiteInicial) {
        this.saldo = saldoInicial;
        this.limite = limiteInicial;
    }

    // Métodos Abstratos (sem corpo)
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    // Getters para acessar os valores com segurança
    public double getSaldo() { return saldo; }
    public double getLimite() { return limite; }
}
