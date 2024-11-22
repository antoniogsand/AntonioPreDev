import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      ArrayList <Persona> personas= new ArrayList<>();
      Random random = new Random();
      String [] nombres= {"Maria", "Manuel", "Carmen", "Jose", "Ana", "Francisco","Laura", "David", "Pilar", "Juan", "Antonio", "Cristina"};
      String [] apellidos= {"Garcia", "Rodriguez", "Fernandez", "Gonzalez", "Lopez", "Martinez", "Sanchez","Perez", "Gomez", "Martin", "Jimenez", "Hernandez"};
    
      for (int i = 0; i < 10; i++) {
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)]; 

        Persona persona = new Persona(nombreAleatorio, apellidoAleatorio);
        personas.add(persona);
    }

    // Imprimir las personas creadas (opcional)
    for (Persona persona : personas) {
        System.out.println(persona.getNombre() + " " + persona.getApellidos());
    }
    
    
    
    
    
    
    }
}
