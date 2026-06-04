class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " puxou o acelerador. Randandan!");
    }

    @Override
    public void frear() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " apertou o freio dianteiro.");
    }
}
