public class Circulo extends Figura{

private double radio;

public Circulo (double radio){
    super(radio, radio);
    this.radio = radio;
}

public double getRadio(){
    return radio;
}
public void setRadio(double radio){
    this.radio = radio;
}

public double CalcularArea(){
    return (radio * radio) * 3.1416;
}

public double CalcularPerimetro(){
    return (radio * 2) * 3.1416;
}

}