package project;

public class contaContcreta extends Conta{
	
	public double depositar(double valor) {
		System.out.println("Conta Concreta");
		return saldo + valor;
	}
	
	public double sacar(double valor) {
		System.out.println("Conta Concreta");
		return saldo - valor;
	}
}
