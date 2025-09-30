public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal){

    super(primerNombre,apellidoPaterno,numeroSeguroSocial);

    if(salarioSemanal < 0.0)
    throw new IllegalArgumentException("el salario semanal debe ser >= 0.0");
    this.salarioSemanal = salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal){
  if(salarioSemanal < 0.0)
    throw new IllegalArgumentException("el salario semanal debe ser >= 0.0");
    this.salarioSemanal = salarioSemanal;

    }

    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    @Override
    public double Ingresos(){
        return getSalarioSemanal();
    }

    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s%n%s: $%, .2f", super.toString(),"salario semanal",getSalarioSemanal());
    }


}