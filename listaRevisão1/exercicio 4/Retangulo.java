package project;

public class Retangulo {
	public float largura;
	public float altura;
	
	
	public Retangulo(float larg, float alt) {
		largura = larg;
		altura = alt;
	}
	
	public void calcularArea() {
		 System.out.println("area: "+largura * altura); 
	}
	
	public void  calcularPerimetro() {
		 System.out.println("Perimetro: "+2*largura + 2*altura); 
	}
	public void  calcularDiagonal() {
		 System.out.println("Diagonal: "+ (float) Math.sqrt((largura*largura)+(altura*altura)));
 
	}	
	public boolean  ehQuadrado() {
		if(largura == altura) {
			return true;
		}else {
			return false;
		}
	}	
}
