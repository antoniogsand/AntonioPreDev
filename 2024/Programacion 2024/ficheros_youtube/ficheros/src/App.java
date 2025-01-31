import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
    
        // leyendo caracter a caracter
        
        FileReader fr = new FileReader("C:/Users/anton/Documents/2t-Antonio-Garc-a/2t-Antonio-Garc-a/2024/Programacion 2024/ejemploFicherosYoutube.txt");

        int c = fr.read();
        
        // el metodo read devuelve -1 cuando llega al final de fichero que está leyendo
        while (c != -1) {
            char letra= (char) c;
            System.out.print(letra);
            c= fr.read();
        }
        fr.close();
    }
}
