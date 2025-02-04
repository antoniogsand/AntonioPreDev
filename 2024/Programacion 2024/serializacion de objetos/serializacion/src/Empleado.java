import java.io.Serializable;


// con implement Serializable se indica que los objetos de esta clase se pueden convertir en bytes
public class Empleado implements Serializable{
    private String nombre;
    private double sueldo;

    public Empleado (String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void subirSueldo (double porcentaje){
        this.sueldo = (sueldo*porcentaje) /100 + sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }







}
