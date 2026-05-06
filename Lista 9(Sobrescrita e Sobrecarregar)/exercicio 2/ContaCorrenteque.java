package projeto;

public class ContaCorrenteque extends ContaBancaria{
	
	public void calcularSaldo(double valor) {
		double saldo = 2000 + valor;
		 System.out.println("O seu saldo na ContaCorrenteque é "+saldo);
	}
	
	
}
