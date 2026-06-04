package project;

public abstract class Conta {
	public float saldo;
	public float limite;
	
	public float depositar(float valor) {
		return saldo + valor;
	}
	
	public float sacar(float valor) {
		return saldo - valor;
	}
}
