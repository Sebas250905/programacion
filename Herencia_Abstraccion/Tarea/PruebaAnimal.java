public class PruebaAnimal {

public static void main(String args[])
{


Animal animal [] = new Animal[2];

animal[0] = new Vibora("samy", "piton", "verde", "sangre fria", 5);
animal[1] = new Perro1("Zeus", "pitbull", "negro", "ciudad", 7, 25.2  );

for(Animal animales: animal ){
    System.out.println(animales.MostrarDatos());
System.out.println("");
}

}
}