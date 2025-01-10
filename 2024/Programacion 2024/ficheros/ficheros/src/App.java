import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {

    /* PrintWriter escritura linea a linea */

        FileWriter fichero= null;
        PrintWriter pw= null;

    try
    {
        fichero = new FileWriter("prueba.txt", true);
        pw = new PrintWriter(fichero);

        for (int i = 0; i<10; i++){
            // el metodo de abajo lo escribe en el fichero de texto no lo saca por pantalla
            pw.println("PrintWriter: linea " + i + "hola");
           //System.out.println("PrintWriter: linea " + i + "hola");
            
        }
    } catch (Exception e){
        System.out.println("Este es el mensaje que salta cuando se produce un error");
    } finally { // Bloque finally para asegurar el cierre de recursos
        try {
            if (pw != null) {
                pw.close();
            }
            if (fichero != null) {
                fichero.close();
            }
        } catch (IOException e2) {
            System.err.println("Error al cerrar el archivo: " + e2.getMessage());
        }
    }

    System.out.println("Programa terminado."); // Mensaje de finalización normal
}
}
    
    
