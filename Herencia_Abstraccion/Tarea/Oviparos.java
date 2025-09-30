public abstract class Oviparos extends Animal{

protected String tipoSangre;

public Oviparos(String nombre, String raza , String color, String tipoSangre){

super(nombre, raza, color);
this.tipoSangre = tipoSangre;

}
public void setTipoSangre(String tipoSangre) {
    this.tipoSangre = tipoSangre;
}
 public String getTipoSangre() {
     return tipoSangre;
 }

public abstract String Sonido();


@override
 public String MostrarDatos(){
return "Nombre: " + nombre + "\nRaza:  " + raza + "\nColor: " + color + "\nTipo de sangre: " + tipoSangre ; 
}




}