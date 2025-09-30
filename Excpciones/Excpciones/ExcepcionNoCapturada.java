//ExcepcionNoCapturada.java
class ExcepcionNoCapturada
{
 public static void main ( String args[] )
 {
 int a = 0;
 int b = 10/a;
 }
}
// clase ExcepcionCapturada
class ExcepcionCapturada
{
 public static void main( String args[] )
 {
 int a, b;
 try
 { //controla el codigo peligroso
 a = 0;
 b = 10/a;
 System.out.println( "Esto ya no se imprime" );
 }
 catch (ArithmeticException objetoExcep)
 {
 System.out.println( "Division por cero" + objetoExcep );
 }
 System.out.println( "Continua el programa ..." );
 }
}
