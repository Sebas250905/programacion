public class PruebaEmpleadoPorComision{

public static void main(String[] args) {
    
EmpleadoPorComision empleado = new EmpleadoPorComision("Antonio","Dominguez" ,"2222-2222", 10000, 0.6);

System.out.println("informacion del empleado obtenido por los metodos establecer: ");
System.out.println("&n&s &s&n", "El primer nombre es: ", empleado.getPrimerNombre());
System.out.println("&s &s&n", "El apellido paterno es: ", empleado.getApellidoPaterno());
System.out.println("&s &s&n", "El numero de seguro social es: ", empleado.getNumeroSeguroSocial());
System.out.println("&s &.2f&n", "Laa ventas brurtas son:  ", empleado.obtenerVentasBrutas());
System.out.println("&s &.2f&n", "La traifa comision es : ", empleado.obtenerTarifaComision());
empleado.establecerVentasBrutas(500);
empleado.establecerTarifaComision(.1);

System.out.println("&n&s:  %n%n&s&n", "Infromacion actualizada del empleado, obtenida mediante toString", empleado.toString());

}



}