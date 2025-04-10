import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private int sueldo;
    private int anyo;
    private int mes;
    private int dia;
    private Date fechaContrato;

public Empleado (String n, int s, int anyo, int mes, int dia){
    this.nombre = n;
    this.sueldo = s;
    GregorianCalendar calendario = new GregorianCalendar(anyo, mes - 1, dia);
    fechaContrato = calendario.getTime();
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getSueldo() {
    return sueldo;
}

public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
}

public Date getFechaContrato() {
    return fechaContrato;
}

public void setFechaContrato(Date fechaContrato) {
    this.fechaContrato = fechaContrato;
}

@Override
public String toString() {
    return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
}





}
