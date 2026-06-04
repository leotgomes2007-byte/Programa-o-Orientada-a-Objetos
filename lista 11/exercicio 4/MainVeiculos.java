public class MainVeiculos {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO VEÍCULOS ---");

        Veiculo carro = new Carro("Toyota", "Corolla", 2024);
        Veiculo moto = new Moto("Honda", "CB 500", 2023);

        carro.acelerar();
        carro.frear();

        System.out.println();

        moto.acelerar();
        moto.frear();
    }
}
