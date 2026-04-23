package projeto;

public class Moto {
	public String marca;
	public String modelo;
	public String cilindrada;
	
	public void atribuirValores(String ma,String mo,String ci) {
		marca = ma;
		modelo = mo;
		cilindrada = ci;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
	public String retornaCilindrada() {
		return cilindrada;
	}
	
	
}
