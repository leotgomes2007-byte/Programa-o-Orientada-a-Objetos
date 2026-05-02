package projeto;

public class ContaCorrente {
	public float saldo;
	
	public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    // Método para depositar
    public void depositar(float valor) {
        saldo += valor;
    }

    // Método para sacar com verificação
    public boolean sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true; // Saque realizado com sucesso
        } else {
            return false; // Saldo insuficiente
        }
    }
	 }
	
	

