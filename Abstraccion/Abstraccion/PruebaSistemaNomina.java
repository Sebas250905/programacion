public class PruebaSistemaNomina {

public static void main (String [] args)
{

EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
EmpleadoPorHoras empleadoPorhoras = new EmpleadoPorHoras("Karen", "Price","222-22-2222" ,16.75 , 40);
EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue","Jones" ,"333-33-3333" , 10000, .06);
EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob","Lewis" ,"444-44-4444" , 5000, .04, 300);

System.out.println("Empleados procesados por separado");
System.out.println("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado, "ingresos", empleadoAsalaradio.Ingresos());
System.out.println("%s%n%s: $%,.2f%n%n ", empleadoPorhoras, "ingresos", empleadoPorhoras.ingresos());
System.out.println("%s%n%s: $%,.2f%n%n ", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
System.out.println("%s%n%s: $%,.2f%n%n ", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());

Empleado [] empleados =  new Empleado[4];

empleados[0] = empleadoAsalariado;
empleados[1] = empleadoPorhoras;
empleados[2] = empleadoPorComision;
empleados[3] = empleadoBaseMasComision;

System.out.println("Empleados procesados en forma polimorfica: \n");
//ciclo for para recorridos//
for(Empleado empleadoActual : empleados )
{
    //implementa el el metodo toString de manera polimorfica 
   System.out.println(empleadoActual);

   //instanceof es una instancia de empleado  para determinar si pertenece a EmpleadoBaseMasComision
   if(empleadoActual instanceof EmpleadoBaseMasComision)
   {

    EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
    empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
    System.out.println("El nuevo salario base con 10% de aumento es: $%,.2f",
    empleado.obtenerSalarioBase());

   }

   System.out.println("ingresos $%,.2f%n%n", empleadoActual.Ingresos());

}

for (int j = 0; j < empleados.length; j++) {
    System.out.println("El empleado %d es un %s%n", j , empleados[j].getClass().getName());
    
}
}
}