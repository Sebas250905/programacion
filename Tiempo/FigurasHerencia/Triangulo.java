public class Triangulo extends Figura{

private double base;
private double altura;
private double lado1;
private double lado2;
private double lado3;


public Triangulo (double base, double altura,double lado1,double lado2, double lado3){
super(base, altura);
this.base = base;
this.altura = altura;
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

public double getBase(){
    return base;
}
public void setBase(double base){
    this.base = base;
}
public double getAltura(){
    return altura;
}
public void setAltura(double altura){
    this.altura = altura;
}

public double CalcularArea(){
    return (base * altura)/2;
}

public double CalcularPerimetro(){
    return lado1 + lado2 + lado3;
}

}