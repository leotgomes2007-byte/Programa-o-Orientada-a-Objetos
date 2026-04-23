package projeto;

public class Carro {
	public String marca;
	public String modelo;
	
	public Carro(String marcaCarro,String modeloCarro){
		System.out.println("estou no construtor");
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public void atribuirValores(String ma,String mo) {
		marca = ma;
		modelo = mo;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
}
