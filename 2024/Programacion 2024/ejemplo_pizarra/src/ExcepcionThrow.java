import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepcionThrow {
    public static void main(String[] args) throws Exception {
        
        try {
             FileReader fr = new FileReader("Hola.txt");
        } catch (FileNotFoundException e) {
    
        }
       





    }
}
