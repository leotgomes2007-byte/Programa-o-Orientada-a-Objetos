class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        validarTriangulo(lado1, lado2, lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void validarTriangulo(double l1, double l2, double l3) {
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            throw new IllegalArgumentException("Os lados do triângulo devem ser maiores que zero.");
        }

        if ((l1 + l2 <= l3) || (l1 + l3 <= l2) || (l2 + l3 <= l1)) {
            throw new IllegalArgumentException(
                "Os valores informados não formam um triângulo válido! A soma de dois lados deve ser maior que o terceiro lado."
            );
        }
    }

    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }

    public void exibirLados() {
        System.out.println("Triângulo criado com os lados: " + lado1 + ", " + lado2 + ", " + lado3);
    }
}
