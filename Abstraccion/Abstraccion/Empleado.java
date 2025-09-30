public abstract class Empleado{

    //final significa no cambiar el valor de la variable una vez establecida//
private final String primerNombre;
private final String apellidoPaterno;
private final String numeroSeguroSocial;

//condtructor para heredar en la subclase//
public Empleado( String primerNombre, String apellidoPaterno, String numeroSeguroSocial){

    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;

}

//no hay setter por el tipo final//
public String getPrimerNombre(){
    return primerNombre;
}

public String getApellidoPaterno(){
    return apellidoPaterno;
}

public String getNumeroSeguroSocial(){
    return numeroSeguroSocial;
}

@Override
public String toString(){

    return String.format("%s %s%nnumero de seguro social %s",
    getPrimerNombre(),getApellidoPaterno(),getNumeroSeguroSocial());
}

public abstract double Ingresos();

}