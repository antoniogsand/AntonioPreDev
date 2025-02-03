import java.io.FileInputStream;

public class LeerBytes {
    public static void main(String[] args) throws Exception{
        
FileInputStream archivoLectura = new FileInputStream("C:/Users/anton/Pictures/imagen.jpg");

int contador=0;

int c = archivoLectura.read();


        while (c != -1) {
        System.out.println(c);
        c= archivoLectura.read();
        contador ++;
        System.out.println(contador);
    }
    archivoLectura.close();
}
}
