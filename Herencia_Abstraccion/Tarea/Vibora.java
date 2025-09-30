public class Vibora extends Oviparos{

private int NoHuevos;

public Vibora (String nombre, String raza , String color, String tipoSangre,int NoHuevos){

  super(nombre,raza,color,tipoSangre);

    this.NoHuevos = NoHuevos;

}

public void setNoHuevos(int noHuevos) {
    NoHuevos = noHuevos;
}

public int getNoHuevos() {
    return NoHuevos;
}

@Override
public String Sonido(){
  return "ssssss"; 
}

@Override
 public String MostrarDatos(){
return "Nombre: " + nombre + "\nRaza:  " + raza + "\nColor: " + color + "\nTipo de sangre: " + tipoSangre
 + "\nNumero de huevos: " + NoHuevos + "\nSonido:" + Sonido(); 
}
}