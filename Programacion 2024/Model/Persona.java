import java.util.ArrayList;

public class Persona {
    private String nombre;
    public ArrayList <Perro> mascotas = new ArrayList<>();
    
    
    public Persona (String n){
        this.nombre= n;
    }

public void agregarMascota (Perro p){
    mascotas.add(p);
}


}
