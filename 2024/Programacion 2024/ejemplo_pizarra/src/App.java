import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        
        HashSet <Persona> personas= new HashSet<Persona>();

        Persona p1 = new Persona(1, "Pepe", "López", 120);
        Persona p2 = new Persona(2, "María", "Flores", 70);
        Persona p3 = new Persona(2, "María", "Flores", 70);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        for (Persona persona : personas) {
            System.out.println(personas);
        }



    }
}
