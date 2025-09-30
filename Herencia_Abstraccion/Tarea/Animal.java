public abstract class Animal{
    
protected String nombre;
protected String raza;
protected String color;

public Animal ( String nombre, String raza , String color){
this.nombre = nombre;
this.raza = raza;
this.color = color;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getRaza(){
    return raza;
}
public void setRaza(String raza){
    this.raza = raza;
}

public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}

public abstract String sonido();

public String MostrarDatos(){
return "Nombre: " + nombre + "\nRaza:  " + raza + "\nColor: " + color; 
}
}

