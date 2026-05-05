package project;

public class principal {
	public static void main(String[] arg) {
	System.out.println("Animal:");
	Animal a = new Animal();
	a.fazerSom();
	
	System.out.println("Cachorro:");
	Cachorro c = new Cachorro();
	c.fazerSom();
	
	a = new Cachorro();
	a.fazerSom();
	
	Passarinho p = new Passarinho();
	System.out.println("Passarinho:");
	p.fazerSom();
	
	Peixe pe = new Peixe();
	System.out.println("Peixe:");
	pe.fazerSom();
	
	}
}
