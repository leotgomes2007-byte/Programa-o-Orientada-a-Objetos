package projeto;

public class ContaBancaria {
	public double saldo;
	
	public ContaBancaria (double saldo) {
		this.saldo = saldo;
	}
public void depositar(double valor) {
	if(valor > 0) {
		System.out.println("Deposito em dinheiro");
		System.out.println("Saldo:"+(saldo + valor)); 

	}else {
		System.out.println("Deposito invalido");
	}
	}
	

}
