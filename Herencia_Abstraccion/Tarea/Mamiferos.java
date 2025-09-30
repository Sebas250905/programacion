public abstract class Mamiferos extends Animal {

 protected String habitat;

 public Mamiferos ( String nombre, String raza , String color,String habitat ){

  super(nombre, raza, color);
this.habitat = habitat;
 }

 public String getHabitat() {
     return habitat;
 }
 public void setHabitat(String habitat) {
     this.habitat = habitat;
 }
 
 public abstract String Sonido();

@override
public String MostrarDatos(){
return "Nombre: " + nombre + "\nRaza:  " + raza + "\nColor: " + color + "\nHabita: " + habitat; 
}


 }