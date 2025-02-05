public class Administrador extends Empleado{

private double incentivo;


public Administrador (String nombre, double sueldo){
    super(nombre, sueldo);
    incentivo = 0;
}

public double getSueldo (){
    double sueldoBase = super.getSueldo();
    return sueldoBase + incentivo;
}

public void setIncentivo (double b){
    this.incentivo= b;
}

@Override
public String toString() {
    return super.toString() + "incentivo = " + incentivo;
}




}
