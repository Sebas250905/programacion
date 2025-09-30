public class Estudiante extends Persona {
    private String id;
    private String carrera;
    private String grado; 
    private int anoGraduacion;
    private double promCalif;

    public Estudiante(String nombre, String fechaNacimiento, String id, String carrera, String grado, int anoGraduacion) {
        super(nombre, fechaNacimiento);
        this.id = id;
        this.carrera = carrera;
        this.grado = grado;
        this.anoGraduacion = anoGraduacion;
        this.promCalif = 0.0;
    }

      public String getId() { return id; }
    public String getCarrera() { return carrera; }
    public String getGrado() { return grado; }
    public int getAnoGraduacion() { return anoGraduacion; }
    public double getPromCalif() { return promCalif; }

    public void setCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    public void calcularPromedio(String[] calificaciones) {
        double suma = 0;
        for(String c : calificaciones){
            suma += convertirNota(c);
        }
        this.promCalif = suma / calificaciones.length;
    }

      
    private double convertirNota(String nota){
        switch(nota){
            case "A": return 4;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2;
            case "D": return 1;
            case "F": return 0;
            default: return 0;
        }
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + 
               "\nFecha Nac.: " + getFechaNacimiento() +
               "\nID: " + id +
               "\nCarrera: " + carrera +
               "\nGrado: " + grado +
               "\nAño Graduación: " + anoGraduacion +
               "\nPromedio: " + String.format("%.2f", promCalif);
    }
}
