public class main {
    public static void main(String[] args) {
        try {
            Triangulo t1 = new Triangulo(3, 4, 5);
            t1.exibirLados();

            System.out.println("----------------------------------------");

            Triangulo t2 = new Triangulo(1, 2, 5);
            t2.exibirLados();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de Geometria: " + e.getMessage());
        }
    }
}
