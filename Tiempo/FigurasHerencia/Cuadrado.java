public class Cuadrado extends Figura{

    private double lado;

public Cuadrado (double lado){
    super(lado, lado);
    this.lado = lado;

}

public double getLado(){
    return lado;
}
public void setLado(double lado){
    this.lado = lado;
}

public double CalcularArea(){
    return lado * lado ;
}

public double CalcularPerimetro(){
return lado + lado + lado + lado;
}
}