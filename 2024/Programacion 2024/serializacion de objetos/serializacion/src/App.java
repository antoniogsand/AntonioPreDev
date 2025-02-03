import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {

        /* ObjectOutputStream se utiliza para escribir objetos en un flujo de salida (en el FIleoutputstream que le entra).
        Este proceso se conoce como "serialización" de objetos. */

        ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/anton/Documents/serializarObjeto/empleado.dat"));



    }
}
