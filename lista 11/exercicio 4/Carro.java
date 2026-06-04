class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " pisou no acelerador. Vrum!");
    }

    @Override
    public void frear() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " acionou os freios ABS.");
    }
}
