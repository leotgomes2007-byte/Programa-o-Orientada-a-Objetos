package projeto;

public class Cheque extends ContaBancaria{
	public double cheque;
	
	public Cheque (double cheque,Double saldo) {
		super(saldo);
		this.cheque = cheque;
	}
	
	public	void depositar(double cheque) {
		if(cheque > 0) {
			System.out.println("Deposito em cheque");
			System.out.println("Saldo:"+(saldo + cheque)); 

		}else {
			System.out.println("cheque invalido");
		}	
	}
}
