import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FicherosBinarios {
    public static void main(String[] args) {
        FileOutputStream fichero = null;
        DataOutputStream flujoDeSalida= null;
        
        try {
            fichero = new FileOutputStream("prueba.dat");
            flujoDeSalida= new DataOutputStream(fichero);
            for (int i = 65; i<=90; i++){
                flujoDeSalida.writeChar(i);
            }
        } catch (Exception e) {
           System.out.println("mal");
        }
    }
}
