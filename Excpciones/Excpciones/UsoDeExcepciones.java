//demostracion del mecanismo de manejo de eexcepciones
// try... catch... finally
public class UsoDeExcepciones
{
 public static void main( String args[] )
 {
 try
 {
 lanzaExcepcion();//llama al metodo lanzaExcepcion
 }// fin de try
 catch ( Exception excepcion ) //excepcion lanzada por lanzaExcepcion
 {
 System.err.println( "La excepcion se manejo en main" );
 } //fin de catch
 
 noLanzaExcepcion();
 } // fin de main
 
 //demuestra los bloques try... catch... finally
 public static void lanzaExcepcion() throws Exception
 {
 try // lanza una excepcion y la atrapa de inmediato
 {
 System.out.println( "Metodo lanzaExcepcion" );
 throw new Exception(); //genera la excepcion
 } // fin de try
 catch ( Exception excepcion ) // atrapa la excepcion lanzada en el bloque try
 {
 System.err.println( "La excepcion se manejo en el metodo lanzarExcepcion" );
 throw excepcion; // vuelve a lanzara la excepcion para procesarla mas adelante
 
 //no se llegaria al codigo que se coloque aqu+i, la excepcion se vuelve a lanzar en el bloque catch
 } // fin de catch
 finally //se ejecuta sin importar lo que ocurra en los bloques try... catch
 {
 System.err.println( "Se ejecuto finally en lanzaExcepcion" );
 } // fin de finally
 
 // no se llega al codigo que se coloque aqui, la excepcion se vuelve a lanzar en el bloque catch
 } // fin del metodo lanzaExcepcion
 
 //demuestra el uso de finally cuando no ocurre una excepcion
 public static void noLanzaExcepcion()
 {
//el bloque try no lanza una excepcion
    try 
 {
 System.out.println( "Metodo noLanzaExcepcion" );
 } // fin de try
 catch ( Exception excepcion ) // no se ejecuta
 {
 System.err.println( excepcion );
 } //fin de catch
 finally //se ejecuta sin importar lo que ocurra en los bloques try... catch
 {
 System.err.println( "Se ejecuto finally en noLanzaExcepcion" );
 } // fin de bloque finally
 System.out.println( "Fin del metodo noLanzaExcepcion" );
 } // fin del metodo noLanzaExcepcion
} //fin de la clase UsoDeExcepciones
