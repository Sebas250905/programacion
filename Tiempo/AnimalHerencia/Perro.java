public class Perro { //clase de tipo objeto//

//declaracion de Atributos, varaiantes de clase, campos de instancia//
private String nombre;
private String raza;
private String ladrido = "Woof";
private double peso;

//primer metodo constructor//
public Perro (String n, String r, double peso) {

nombre = n;
raza = r;
this.peso = peso;
}

//segundo metodo constructor con todos los atributos//
public Perro (String n, String r, double peso, String ladrido){

nombre = n;
this.ladrido = ladrido;
raza = r;
this.peso = peso;b

}

//metodo getter para nombre//
public String getNombre(){
return nombre;
}

//metodo setter para nombre//
public void setNombre(String nombre){
this.nombre = nombre;
}

public String getRaza(){
    return raza;
}

public void setRaza(String raza){
    this.raza = raza;
}

public double getPeso(){
    return peso;
}

public void setPeso(double peso){
    this.peso = peso;
}

//metodo funcional//
public void Ladrar(){
    System.out.println(ladrido);
}

}