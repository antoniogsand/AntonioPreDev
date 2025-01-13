import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
    
        //String texto= null;

        FileWriter escritura = new FileWriter("Escribiendo.txt");
    
        escritura.write("Una prueba");
        escritura.write("Una segunda prueba");
        escritura.close();
        FileReader lectura = new FileReader("Escribiendo.txt");
        char caracter = (char) lectura.read();
    
        System.out.println(caracter);
    }
    }
    

