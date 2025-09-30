public class ExcepcionCapturada {

public static void main(String [] args){

int a,b;

try {
    a = 0;
    b = 10/a;//aqui ocurre la excepcion//
    System.out.println("esta linea de codigo ya no se lee");

} catch (ArithmeticException e) {

System.out.println("Error, division entre 0" + e);
}

System.out.println("aqui continua el programa despues de la gestion de excepcion");

}

}

