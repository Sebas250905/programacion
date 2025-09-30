// Factura.java
public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser >= 0");
        }
        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        }

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    // establece la cantidad
    public void establecerCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser >= 0");
        }
        this.cantidad = cantidad;
    }

    // obtiene la cantidad
    public int obtenerCantidad() {
        return cantidad;
    }

    // establece el precio del artículo
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0) {
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        }
        this.precioPorArticulo = precioPorArticulo;
    }

    // obtiene el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // obtiene el número de pieza
    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    // obtiene la descripción de la pieza
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // devuelve representación String de un objeto Factura
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "número de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
                "cantidad", obtenerCantidad(), "precio por artículo", obtenerPrecioPorArticulo());
    }

    // implementa el método obtenerMontoPago de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
}