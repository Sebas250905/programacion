public class PruebaAnimal {

public static void main(String args[])
{

Perro perro1 = new Perro ("Ace", "Beagle", 45.6);
Perro perro2 = new Perro ("Balley", "Borboel", 80.2, "arf-arf");

System.out.println("nombre del perro: " + perro1.getNombre());
System.out.println("Raza del perro: " + perro1.getRaza());
System.out.println("Peso del perro: " + perro1.getPeso());
System.out.println("Ladrido del perro: " );
perro1.Ladrar();

System.out.println("nombre del perro: " + perro2.getNombre());
System.out.println("Peso el perro: " + perro2.getPeso());
System.out.println("Raza del perro: " + perro2.getRaza());
System.out.println("ladrido del perro: " );
perro2.Ladrar();

//System.out.println("cambiamos el ladrido del perro 2 :");
//perro2.ladrido("grr-grr");

}
}