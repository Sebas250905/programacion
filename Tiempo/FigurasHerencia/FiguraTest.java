public class FiguraTest{

    public static void main(String[] args) {
        
Cuadrado cuadrado = new Cuadrado (7.0);
Triangulo triangulo = new Triangulo (10.0,6.0 , 7.0, 8.0, 10.0);
Circulo circulo = new Circulo(5.0);

System.out.println("El area del Cuadrado es: " + cuadrado.CalcularArea());
System.out.println("El perimetro del Cuadrado es: " + cuadrado.CalcularPerimetro());
System.out.println(); 

System.out.println("El area del triangulo es:" + triangulo.CalcularArea());
System.out.println("El perimetro del triangulo es:" + triangulo.CalcularPerimetro());
System.out.println();

System.out.println("El area del Circulo es:" + circulo.CalcularArea());
System.out.println("El perimetro del Circulo es:" + circulo.CalcularPerimetro());



}
}