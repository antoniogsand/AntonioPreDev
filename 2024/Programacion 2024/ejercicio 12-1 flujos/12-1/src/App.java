import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
    
        String [] personas = new String[5];

        personas [0]= "Antonio";
        personas [1]= "Luis";
        personas [2]= "Pedro";
        personas [3]= "Juan";
        personas [4]= "Carlos";



        FileWriter escritura = new FileWriter("hola.txt");
    
        for (int i = 0; i<personas.length; i++){
            escritura.write(personas[i]);
        }
        escritura.close();
        /* 
        escritura.write("Una segunda prueba");
        FileReader lectura = new FileReader("Escribiendo.txt");
        char caracter = (char) lectura.read();
    
        System.out.println(caracter);
    } */
    }
}
    

