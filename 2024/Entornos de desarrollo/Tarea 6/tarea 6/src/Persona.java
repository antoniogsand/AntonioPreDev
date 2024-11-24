public class Persona {
    private String nombre;
    private String apellidos;

    
public Persona (){
        this.nombre= "";
        this.apellidos= "";
    }

public Persona (String nombr, String apell){
        this.nombre= nombr;
        this.apellidos= apell;
    }

public String getNombre (){
    return nombre;
}
public void setNombre (String nombr){
    this.nombre= nombr;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

@Override
public String toString() {
    return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
}










}
