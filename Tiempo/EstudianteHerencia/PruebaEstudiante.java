
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fecha = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        System.out.print("Grado  ");
        String grado = scanner.nextLine();
        System.out.print("Año de graduación esperado: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); 

        Estudiante estudiante = new Estudiante(nombre, fecha, id, carrera, grado, anio);

       
        System.out.print("¿Cuántas calificaciones ingresará?: ");
        int n = scanner.nextInt();
        scanner.nextLine();

          String[] califs = new String[n];
        for(int i=0; i<n; i++){
            System.out.print("Ingrese calificación:  " + (i+1)  );
            califs[i] = scanner.nextLine();
        }

        estudiante.calcularPromedio(califs);

        
        System.out.println("\n Datos del Estudiante ");
        System.out.println(estudiante);

      
        System.out.print("\n¿Desea cambiar la carrera? (si/no): ");
        String resp = scanner.nextLine();
        if(resp.equalsIgnoreCase("si")){
            System.out.print("Ingrese la nueva carrera: ");
            String nuevaCarrera = scanner.nextLine();
            estudiante.setCarrera(nuevaCarrera);
            System.out.println("Carrera cambiada a: " + estudiante.getCarrera());
        } else {
            System.out.println("Fin del programa.");
}
}
}