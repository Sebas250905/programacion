public class TestCuadrado {
    public static void main(String[] args) {
        // Crear las figuras
        Cuadrado cuadrado = new Cuadrado(4);
        Triangulo triangulo = new Triangulo(5, 3, 5, 4, 6);
        Circulo circulo = new Circulo(3);

        // Probar cuadrado
        System.out.println("----- Cuadrado -----");
        System.out.println("Lado: 4");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        // Probar triángulo
        System.out.println("\n----- Triángulo -----");
        System.out.println("Base: 5, Altura: 3, Lados: 5, 4, 6");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        // Probar círculo
        System.out.println("\n----- Círculo -----");
        System.out.println("Radio: 3");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}

