public class AnimalTest {

    public static void main (String args[] ){

Perro1 perro = new Perro1 ("Ace", "Beagle", "blanco","woof",30.5);
Pez pez1 = new Pez ("Dorado","goldfish","naranja", "agua dulce");

System.out.println("nombre del perro: " + perro.getNombre());
System.out.println("Raza del perro: " + perro.getRaza());
System.out.println("Color del perro: " + perro.getColor());
System.out.println("Peso del perro: " + perro.getPeso());
System.out.println("Ladrido del perro: " );
perro.Ladrar();

System.out.println();

System.out.println("nombre del pez: " + pez1.getNombre());
System.out.println("Raza del pez: " + pez1.getRaza());
System.out.println("Color del pez: " + pez1.getColor());
System.out.println("Tipo de agua: " + pez1.getAgua());
    }
    
}