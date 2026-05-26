package project;

public class Conta {
	public String numero;
	public String titular;
	public Double saldo;
	
	public Conta(String numero,String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void exibir() {
		System.out.println("Numero: "+numero+" -Titular: "+titular+" -saldo: "+saldo);
	}
}
