package projeto;

public class Netbook extends Computador {

    public Netbook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return this.marca;
    }
}
