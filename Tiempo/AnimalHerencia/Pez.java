public class Pez extends Animal {

private String tipoAgua;

public Pez (String nombre, String raza, String color,String tipoAgua){
    super(nombre,raza,color);
this.tipoAgua = tipoAgua;
}

public String getAgua(){
    return tipoAgua;
}
 
public void setAgua(){
    this.tipoAgua = tipoAgua;
}










}