package project;

public class Cachorro extends Animal {
	protected String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println("Latir: "+som);
	}

}
