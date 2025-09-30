public class Perro1 extends Animal {

private String ladrido = "woof";
private double peso;

public Perro1 (String nombre, String raza, String color, String ladrido, double peso){
    super(nombre,raza,color);
    this.ladrido = ladrido;
    this.peso = peso;
}

public String getLadrido(){
    return ladrido;
}
public void setLadrido(String ladrido){
    this.ladrido = ladrido;
}


public double getPeso(){
    return peso;
}
public void setPeso(double peso){
    this.peso = peso;
}

public void Ladrar(){
    System.out.println(ladrido);
}

}