// Demostracion de la limpieza de la pila
public class UsoDeExcepciones2
{
 public static void main( String args[] )
 {
 try // llama a lanzaExcepcion para demostrar la limpieza de la pila
 {
 lanzaExcepcion();
 } // fin de try
 catch ( Exception excepcion ) // excepcion lanzada en lanzaExcepcion
 {
 System.err.println( "La excepcion se manejo en main" );
 } //fin de catch
 } // fin de main
 
 //lanzaExcepcion laza la excepcion que no se atrapa en este metodo
 public static void lanzaExcepcion() throws Exception
 {
    //lanza una excepcion y la atrapa en main
 try 
 {
 System.out.println( "Metodo lanzaExcepcion" );
 throw new Exception(); //genera la excepcion
 } // fin de try
 catch ( RuntimeException runtimeException ) //atrapa el tipo incorrecto
 {
 System.err.println( "La excepcion se manejo en el metodo lanzarExcepcion" );
 } // fin de catch
 finally // el bloque finally siempre se ejecuta
 {
 System.err.println( "Finally siempre se ejecuta" );
 } //fin de finally
 } // fin del metodo lanzaExcepcion
} //fin de la clase UsoDeExcepciones2
