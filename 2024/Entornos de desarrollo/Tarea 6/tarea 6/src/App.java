import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    
        // donde voy a guardar las personas creadas
    ArrayList <Persona> personas= new ArrayList<>();
    ArrayList <Dni> Dnis= new ArrayList<>();
        // Esta clase tiene una método que genera un número aleatorio
        // En este caso me generará una posición aleatoria del array apellidos
        // Del otro array se puedem obtener las posiciones (del 0 al final) de forma secuencial con nombresSecuencial= nombres[i]
        // Pero lo haré aleatorio también ya que quiero imprimir por pantalla más de 12 veces el contenido del array nombres
    Dni d1 = new Dni();
    
    
    Random random = new Random();
    String [] nombres= {"Maria", "Manuel", "Carmen", "Jose", "Ana", "Francisco","Laura", "David", "Pilar", "Juan", "Antonio", "Cristina"};
    String [] apellidos= {"Garcia", "Rodriguez", "Fernandez", "Gonzalez", "Lopez", "Martinez", "Sanchez","Perez", "Gomez", "Martin", "Jimenez", "Hernandez"};
    


    for (int i = 0; i < 20; i++) {
        String nombreSecuencial =  nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)]; 

        /* creo un objeto persona con dos String por parámetros como le indico en el constructor por parámetros
         * Se añaden los objetos al ArrayList
         * las dos variables de tipo String solo están dentro del for pero el ArrayList está fuera y por eso se quedan almacenadas allí
        */
        Persona persona = new Persona(nombreSecuencial, apellidoAleatorio);
        personas.add(persona);
    }

    for (int i=0; i<20; i++){
        String dniAleatorio= d1.generarDni();
        Dni dni= new Dni(dniAleatorio);
        Dnis.add(dni);
    }
    // Generar personas más su dni
    for (int i=0; i<personas.size(); i++) {
                Persona persona = personas.get(i);
                System.out.println(persona.getNombre() + " " + persona.getApellidos() + " " + d1.generarDni()); 
        }

    
    // que solo muestre aquellas personas generadas cuyo dni acaba en A
        for (int i=0; i<personas.size(); i++) {
        if(d1.generarDni().charAt(8)== 'A'){
            Persona persona = personas.get(i);
            System.out.println(persona.getNombre() + " " + persona.getApellidos() + " " + d1.getDni());
        }
    }
    

    
    
    
    
    
    
    }







    
}
