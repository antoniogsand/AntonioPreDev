public class ContratoLaboral {
    private double salario=0;
    private String tipoJornada= "";
    private String clausulas = "";

public ContratoLaboral (){
    this.salario= salarioMayorCero(salario);
    this.tipoJornada=validarTipoJornada(tipoJornada);
    this.clausulas= validarClausulas(clausulas);
}

public ContratoLaboral (double sal, String tipoJor, String clausulas){
    this.salario= sal;
    this.tipoJornada= tipoJor;
    this.clausulas= clausulas;
}



public double getSalario() {
    return salario;
}

public void setSalario(double salarioMayorCero) {
   if (this.salario>0){

   }else{
    System.out.println("El salario no es mayor a cero");
   } 
}

public String getTipoJornada() {
    return tipoJornada;
}

public void setTipoJornada(String tipoJornada) {
    this.tipoJornada = tipoJornada;
}

public String getClausulas(){
    return clausulas;
}

public void setClausulas (String clausulas){
    this.clausulas= clausulas;
}

@Override
public String toString() {
    return "ContratoLaboral [salario=" + salario + ", tipoJornada=" + tipoJornada + ", clausulas=" + clausulas + "]";
}

// Métodos personalizados


public double salarioMayorCero (double salario){
    if(salario>0){
        this.salario= salario;
    }else {System.out.println("El salario es incorrecto");}
    return salario;
}

public String validarTipoJornada (String jorn){
    if (jorn== "completa" || jorn== "parcial"){
        this.tipoJornada= jorn;
    }
    return jorn;
}

public String validarClausulas (String clausulas){
    if (clausulas.length()>500){
        this.clausulas= clausulas;
    }
    return clausulas;
}

}