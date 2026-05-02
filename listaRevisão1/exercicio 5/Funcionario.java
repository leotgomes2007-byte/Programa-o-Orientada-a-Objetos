package project;

public class Funcionario {
	public String nome;
	public float salario;
	public int horasExtras;
	
	public Funcionario(String no, float sal, int ex) {
		nome = no;
		salario = sal;
		horasExtras = ex;
	}
	
	public void calcularValorHoraExtra() {
		 System.out.println("Hora Extra: " +horasExtras * 50); 
	}
	
	public void  calcularPagamentoTotal() {
		 System.out.println("Salario final: "+ (salario + horasExtras * 50)); 
	}
	
	public int adicionarHorasExtras(int novos) {
		
		return horasExtras+= novos;
	}
	
	public void  salarioAnual() {
		 System.out.println("salario anual: "+ salario*12);

	}	
}
