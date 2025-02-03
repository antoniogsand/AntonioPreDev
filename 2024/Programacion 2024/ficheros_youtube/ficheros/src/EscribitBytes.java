import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EscribitBytes {
    public static void main(String[] args) throws Exception{
    
    // ruta de lectura de bytes
    FileInputStream archivoLectura = new FileInputStream("C:/Users/anton/Pictures/imagen.jpg");
    
    // ruta de escritura
    FileOutputStream archivoEscritura = new FileOutputStream("C:/Users/anton/Pictures/imagen_copia.jpg");

    /* los archivos están compuestos de bytes y lo que hará la variable de tipo entero es almacenar esos bytes
     * pero en forma de numeros. Cada byte represents un numero entre 0 y 255 que contiene información
     * es importante declarar la variable pero no iniciarla ya que se inicia a la vez que se establece la condición de bucle while
     * la clase FileOutputStream tiene un metodo write el cual imprime lo que he guardado previamente en c
     */
        int c;
        while ((c = archivoLectura.read()) != -1) {

            archivoEscritura.write(c);
        }

        archivoLectura.close();
        archivoEscritura.close();

        System.out.println("Imagen copiada.");
    }
}
