// Programa de prueba de la interfaz PorPagar que procesa objetos Factura y Empleado

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        // Crea arreglo PorPagar con cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[7];

        // Llena el arreglo con objetos que implementan PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new EmpleadoPorComision("Antonio","Dominguez" ,"2222-2222", 10000, 0.6);
        objetosPorPagar[5] = new EmpleadoBaseMasComision("Bob","Lewis" ,"444-44-4444" , 5000, .04, 300);
        objetosPorPagar[6] = new EmpleadoPorHoras("Karen", "Price","222-22-2222" ,16.75 , 40);

        System.out.println("Facturas y Empleados procesados en forma polimórfica:\n");

        // Procesa en forma genérica cada elemento del arreglo
        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.printf("%s \n%s: $%,.2f\n\n",
                porPagarActual.toString(),
                "pago vencido", porPagarActual.obtenerMontoPago());
        
        if(porPagarActual instanceof EmpleadoBaseMasComision)
   {

    EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) porPagarActual;
    empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
    System.out.printf("%s%n $%,.2f %n","El nuevo salario base con 10% de aumento es: ",empleado.obtenerSalarioBase());

   }

   System.out.printf("ingresos: $%,.2f%n%n", porPagarActual.obtenerMontoPago());
    }
    
    }
}