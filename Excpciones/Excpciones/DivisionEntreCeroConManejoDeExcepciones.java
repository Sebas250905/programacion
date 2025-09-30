//Ejemplo de manejo de excepciones que verifica la division entre cero
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionEntreCeroConManejoDeExcepciones
{
 // demuestra como se lanza una excepcion cuando ocurre una division entre cero
 public static int cociente( int numerador, int denominador )
 throws ArithmeticException
 {
 return numerador / denominador; //posible division entre cero
 } // fin del metodo cociente
 
 public static void main( String args[] )
 {
 Scanner explorador = new Scanner( System.in ); //objeto Scanner para entrada
 boolean continuarCiclo = true; // determina si se necesitan mas datos de entrada
 
 do
 {
    // lee dos numeros y calcula el cociente
 try 
 {
 System.out.print( "Introduzca un numerador entero: " );
 int numerador = explorador.nextInt();
 System.out.print( "Introduzca un denominador entero: " );
 int denominador = explorador.nextInt();
 
 int resultado = cociente( numerador, denominador );
 System.out.printf( "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
 continuarCiclo = false; // entrada exitosa; termina el ciclo
 } // fin bloque try
 catch ( InputMismatchException inputMismatchException )
 {
 System.err.printf( "\nExcepcion: %s\n", inputMismatchException );
 explorador.nextLine(); //descarta entrada para que el usuario intente otra vez
 System.out.println( "Debe introducir enteros. Intente de nuevo.\n" );
 } // fin del bloque catch
 catch ( ArithmeticException arithmeticException )
 {
 System.err.printf( "\nExcepcion: %s\n", arithmeticException );
 System.out.println( "Cero es un denominador invalido. Intente de nuevo.\n" );
 } // fin del catch
 } while ( continuarCiclo ); //fin de do... while
 } //fin de main
} // fin de la clase DivisionEntreCeroConManejoDeExcepciones