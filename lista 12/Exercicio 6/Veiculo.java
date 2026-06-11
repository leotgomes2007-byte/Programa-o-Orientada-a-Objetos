package project;

public abstract class Veiculo {
	 public String Marca;
	 public String Modelo;
	 public int Ano;
	 
	 public Veiculo(String marca, String modelo, int ano) {
		super();
		Marca = marca;
		Modelo = modelo;
		Ano = ano;
	 }

	 public String getMarca() {
		 return Marca;
	 }

	 public void setMarca(String marca) {
		 Marca = marca;
	 }

	 public String getModelo() {
		 return Modelo;
	 }

	 public void setModelo(String modelo) {
		 Modelo = modelo;
	 }

	 public int getAno() {
		 return Ano;
	 }

	 public void setAno(int ano) {
		 Ano = ano;
	 }
	 
	 public void Acelerar() {
		 System.out.println("Veiculo");
		 System.out.println("você está acelerando");
	 }
	 
	 public void Frear() {
		 System.out.println("Veiculo");
		 System.out.println("você está Freando");
	 }
}
