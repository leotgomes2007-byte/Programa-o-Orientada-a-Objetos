package project;

public class Gerente extends Funcionario {
protected double bonus;

public Gerente(String nome, double salario, double bonus) {
	super(nome, salario);
	this.bonus = bonus;
}

public void aumentarSalario() {
	salario += bonus;
	System.out.println("O salário do Gerente é:"+salario);
}

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

@Override
public String toString() {
	return "Gerente [bonus=" + bonus + "]";
}


}
