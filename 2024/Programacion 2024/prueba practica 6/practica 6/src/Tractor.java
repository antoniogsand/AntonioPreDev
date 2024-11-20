import java.sql.Date;
import java.time.LocalDateTime;

public class Tractor extends Vehiculo{
    private  double precioDia;
    private Date fechaAlquiler;
    private Date fechaDevolucion;

public Tractor (String matricula, boolean estadoAlquiler, double precioDia, Date fechaAlquiler){
    super(matricula, estadoAlquiler);
    this.precioDia= precioDia;
    this.fechaAlquiler=fechaAlquiler;
}

public double getPrecioDia() {
    return precioDia;
}

public void setPrecioDia(double precioDia) {
    this.precioDia = precioDia;
}

public Date getFechaAlquiler() {
    return fechaAlquiler;
}

public void setFechaAlquiler(Date fechaAlquiler) {
    this.fechaAlquiler = fechaAlquiler;
}

public Date getFechaDevolucion() {
    return fechaDevolucion;
}

public void setFechaDevolucion(Date fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
}

@Override
public boolean alquilar (){
    if (this.estadoAlquiler == false){
        return true;
    }else {
        return false;
    }
}


//me he quedado justo aquí


@Override
public boolean devolver (){
    if (this.estadoAlquiler== true){
        this.estadoAlquiler = false;
       LocalDateTime.now() 
     
        return true;
    } return false;
}
@Override
public String toString() {
    return "Tractor [precioDia=" + precioDia + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion="
            + fechaDevolucion + "]";
}









}
