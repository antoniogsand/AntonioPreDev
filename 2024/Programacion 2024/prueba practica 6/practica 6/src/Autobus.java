public class Autobus extends Vehiculo {
    private double precioKm;
    private double kilometrosInicio;
    private double kilomretosDevolucion;

    public Autobus (String matricula, boolean estadoAlquiler, double precioKm){
        super (matricula, estadoAlquiler);
        this.precioKm= precioKm;
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public double getKilometrosInicio() {
        return kilometrosInicio;
    }

    public void setKilometrosInicio(double kilometrosInicio) {
        this.kilometrosInicio = kilometrosInicio;
    }

    public double getKilomretosDevolucion() {
        return kilomretosDevolucion;
    }

    public void setKilomretosDevolucion(double kilomretosDevolucion) {
        this.kilomretosDevolucion = kilomretosDevolucion;
    }

    @Override
    public boolean alquilar (){
        if (this.estadoAlquiler == false){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean devolver (){
        if (this.estadoAlquiler== true){
            this.estadoAlquiler = false;
            double precioKm= (this.getKilomretosDevolucion())-this.getKilometrosInicio()* this.precioKm;
            System.out.println(precioKm);
            return true;
        } return false;
    }
    @Override
    public String toString() {
        return "Autobus [ estadoAlquiler= " + estadoAlquiler + " matricula= " + matricula + " precioKm= " + precioKm + ", kilometrosInicio= " + kilometrosInicio + ", kilomretosDevolucion= "
                + kilomretosDevolucion + "]";
    }

    









}
