class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPorcentagem; // Ex: 0.10 para 10%

    public Vendedor(String nome, double salarioBase, double comissaoPorcentagem) {
        super(nome, salarioBase);
        this.comissaoPorcentagem = comissaoPorcentagem;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissaoPorcentagem);
    }
}
