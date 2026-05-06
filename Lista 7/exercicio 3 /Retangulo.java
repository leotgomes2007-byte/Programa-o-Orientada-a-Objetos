package project;

public class Retangulo {
private int base;
private int altura;
	
	public Retangulo(int base,int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double calculaArea() {
		return base*altura;
	}
	
}


