import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        Persona p1 = new Persona("Antonio", "García");
        Dni d1 = new Dni();
        Dni d2 = new Dni(34231254, 'A');
        System.out.println(d1);
      // creando en el Main el ArrayList que me permita guardar los diferentes objetos
        ArrayList<Dni> dni = new ArrayList<Dni>();
        dni.add(d1);
        dni.add(d2);
        System.out.println("Me muestra los dni del ArrayList " + dni);
        
        System.out.println(dni.get(1));
       
   
        



    }
}
