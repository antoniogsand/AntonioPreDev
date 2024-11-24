import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    
        // donde voy a guardar las personas creadas
    ArrayList <Persona> personas= new ArrayList<>();
    ArrayList <Dni> Dnis= new ArrayList<>();
    Dni d1 = new Dni();
        // La clase Dni tiene el método generarDni que genera un número aleatorio y le añade una letra al final
        Random random = new Random();
        
        
        // En este caso me generará una posición aleatoria del array apellidos
        // Del otro array se puedem obtener las posiciones (del 0 al final) de forma secuencial con nombresSecuencial= nombres[i]
        // Pero lo haré aleatorio también ya que quiero imprimir por pantalla más de 12 veces el contenido del array nombres    
    String [] nombres= {"Maria", "Manuel", "Carmen", "Jose", "Ana", "Francisco","Laura", "David", "Pilar", "Juan", "Antonio", "Cristina"};
    String [] apellidos= {"Garcia", "Rodriguez", "Fernandez", "Gonzalez", "Lopez", "Martinez", "Sanchez","Perez", "Gomez", "Martin", "Jimenez", "Hernandez"};
    


    for (int i = 0; i < 100; i++) {
        String nombreSecuencial =  nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)]; 

        /* creo un objeto persona con dos String por parámetros como le indico en el constructor por parámetros
         * Se añaden los objetos al ArrayList
         * las dos variables de tipo String solo están dentro del for pero el ArrayList está fuera
         * por eso se quedan almacenadas allí
         * Creo un objeto de tipo Dni y usando el constructor por parámetros
         * le entra un String que he creado antes y cuyo valor es el de un objeto tipo Dni junto
         * con el método para generar un dni aleatorio
         * al igual que con el ArrayLista de personas guardo en el ArrayList dnis los dnis generados
        */
        Persona persona = new Persona(nombreSecuencial, apellidoAleatorio);
        personas.add(persona);
        String dniAleatorio= d1.generarDni();
        Dni dni= new Dni(dniAleatorio);
        Dnis.add(dni);
    }

    /* obtengo del ArrayList las personas generadas y los dni generados y le pongo como condición
     * que solo me muestre las que tengan la letra A al final
     */
    for (int i=0; i<personas.size(); i++) {
        if(Dnis.get(i).getDni().charAt(8)== 'A'){
            Persona persona = personas.get(i);
            Dni dni= Dnis.get(i);
            System.out.println(persona.getNombre() + " " + persona.getApellidos() + " " + dni.getDni()); 
            }
        }

    }

}
