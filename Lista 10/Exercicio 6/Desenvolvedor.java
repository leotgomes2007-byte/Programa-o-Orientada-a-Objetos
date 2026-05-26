package project;

public class Desenvolvedor extends Funcionario{
protected double horas;

public Desenvolvedor(String nome, double salario, double horas) {
	super(nome, salario);
	this.horas = horas;
}

public void aumentarSalario() {
	salario += horas*20;	//assumi o valor da hora extra sendo 20 R$
	System.out.println("O salário do Desenvolvedor é:"+salario);
}

public double getHoras() {
	return horas;
}

public void setHoras(double horas) {
	this.horas = horas;
}


}
