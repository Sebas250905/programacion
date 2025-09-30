public class Perro1 extends Mamiferos {

private int edad;
private double peso;

public Perro1 (String nombre, String raza , String color,String habitat,int edad, double peso){
  super(nombre, raza, color, habitat);
    this.edad = edad;
    this.peso = peso;
}

public void setEdad(int edad) {
    this.edad = edad;
}
public int getEdad() {
    return edad;
}

public double getPeso(){
    return peso;
}
public void setPeso(double peso){
    this.peso = peso;
}

 @Override
 public String Sonido(){
    return "woof-woof";
}

@Override
public String MostrarDatos(){
return "Nombre: " + nombre + "\nRaza:  " + raza + "\nColor: " + color + "\nHabitat: " + habitat 
+ "\nEdad: " + edad + "\nPeso: " + peso + "\nsonido: " + Sonido(); 
}

}
