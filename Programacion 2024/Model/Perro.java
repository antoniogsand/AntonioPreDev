public class Perro {
    private String nombre;
    public Persona propietario;

    public Perro (String n){
        this.nombre = n;
    }
public void asiganarPropietario(Persona p){
    propietario= p;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Persona getPropietario() {
    return propietario;
}
public void setPropietario(Persona propietario) {
    this.propietario = propietario;
}
@Override
public String toString() {
    return "Perro [nombre=" + nombre + ", propietario=" + propietario + "]";
}


}
