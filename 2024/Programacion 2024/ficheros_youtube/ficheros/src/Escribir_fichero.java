import java.io.FileWriter;
import java.io.IOException;

public class Escribir_fichero {
    public static void main(String[] args) throws IOException {
        
        String frase = "Estoy probando a escribir en un fichero";

        FileWriter fw = new FileWriter("prueba escritura.txt");
        fw.write(frase);

        /* 
        for (int i=0; i<frase.length(); i++){
            fw.write(frase.charAt(i));
        }
        */
    fw.close();

    }
}
