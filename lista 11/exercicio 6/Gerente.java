class Gerente extends Funcionario {
    private double bonusGerencial;

    public Gerente(String nome, double salarioBase, double bonusGerencial) {
        super(nome, salarioBase);
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusGerencial;
    }
}
