import java.io.FileWriter;
import java.io.IOException;

public class Escribir_fichero {
    public static void main(String[] args) throws IOException {
        
        // escribiendo caracter a caracter

        String frase;

        FileWriter fw = new FileWriter("prueba escritura.txt");


        for (int i = 0; i < 15; i++) {
            frase = "Linea";
            fw.write(frase);
            System.out.print(i);
            System.out.println(" "+frase);
            }
        /* 
        for (int i=0; i<frase.length(); i++){
            fw.write(frase.charAt(i));
        }
        */
    fw.close();

    }
}
