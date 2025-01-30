import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        FileReader fr = new FileReader("C:/Users/anton/Documents/2t-Antonio-Garc-a/2t-Antonio-Garc-a/2024/Programacion 2024/ejemploFicherosYoutube.txt");

        int c = fr.read();
        
        // el metodo read devuelve -1 cuando llega al final de fichero que está leyendo
        while (c != -1) {
            char letras= (char) c;
            System.out.print(letras);
            c= fr.read();
        }
        fr.close();
    }
}
