abstract class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos Get e Set para encapsulamento
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Permite que as classes filhas alterem o saldo internamente ou via depósito
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
}
