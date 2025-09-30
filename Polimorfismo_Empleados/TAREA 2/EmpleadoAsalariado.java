// La clase EmpleadoAsalariado extiende Empleado e implementa la interfaz PorPagar

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    // Constructor
    public EmpleadoAsalariado(String nombre, String apellidoPaterno,
        String numeroSeguroSocial, double salarioSemanal) {
        super(nombre, apellidoPaterno, numeroSeguroSocial);

        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // Establece el salario semanal
    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    // Devuelve el salario semanal
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    // Implementa el método de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    // Devuelve representación String del objeto
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s%n%s: $%,.2f",
            super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}