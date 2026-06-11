package project;

public class Moto extends Veiculo{

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	 public void Acelerar() {
		 System.out.println("Moto");
		 System.out.println("você está acelerando");
	 }
	 
	 public void Frear() {
		 System.out.println("Moto");
		 System.out.println("você está Freando");
	 }

}
