import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffers {
    public static void main(String[] args) throws IOException {

                // Abro el flujo de lectura del archivo que tengo yo guardado en esa ruta
                FileReader fr = new FileReader("C:/Users/anton/Documents/2t-Antonio-Garc-a/2t-Antonio-Garc-a/2024/Programacion 2024/ejemploFicherosYoutube.txt");
                // Alnaceno en el buffer (la memoria intermedia)
                BufferedReader br = new BufferedReader(fr);

            String linea = "";

            while (linea != null) {
                linea= br.readLine();
                if (linea != null) {
                System.out.println(linea);
                
                }
            }
        br.close();
    }
}
