public class Vehiculo {
    protected String matricula;
    protected boolean estadoAlquiler;

    public Vehiculo(String matricu, boolean estadoAlqu){
        this.matricula= matricu;
        this.estadoAlquiler= false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isEstadoAlquiler() {
        return estadoAlquiler;
    }

    public void setEstadoAlquiler(boolean estadoAlquiler) {
        this.estadoAlquiler = estadoAlquiler;
    }

  
    public boolean alquilar (){
        if (this.estadoAlquiler == false){
            return true;
        }else {
            return false;
        }
    }

    public boolean devolver (){
        if (this.estadoAlquiler== true){
            this.estadoAlquiler = false;
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", estadoAlquiler=" + estadoAlquiler + "]";
    }







    
}
