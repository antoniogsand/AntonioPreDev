import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) throws Exception {

Administrador jefe = new Administrador("Antonio", 1500);
jefe.setIncentivo(100);
Empleado [] personal = new Empleado[3];

personal [0]= jefe;
personal [1]= new Empleado("Ana", 1400);
personal [2]= new Empleado("Pedro", 1390);


        /* ObjectOutputStream se utiliza para escribir objetos en un flujo de salida (en el FIleoutputstream que le entra).
        Este proceso se conoce como "serialización" de objetos.
        ObjectOutputStream serializa el objeto y FileOutputStream toma esa secuencia de bytes serializada
        y la escribe en el archivo. */
// escribiendo un fichero
        ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/anton/Documents/serializarObjeto/empleado.dat"));

        escribiendo_fichero.writeObject(personal);
// recuperando un fichero
        ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/anton/Documents/serializarObjeto/empleado.dat"));
        Empleado [] personas_recuperadas = (Empleado[])recuperando_fichero.readObject();
        
        /* bucle for each
         * se indica de que tipo de datos es lo que va a recorrer
         * una variable donde se almacenan los datos
         * que va a recorrer 
         */
        for (Empleado persona : personas_recuperadas){
            System.out.println(persona);
        }
        //Otra forma de almacenar los objeros que contiene ese fichero.
        //Object personal_recuperado = recuperando_fichero.readObject();
        
    }
}
