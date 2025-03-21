import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
    

// el flujo de lectura para el archivo que tengo guardado

FileReader flujoTxt = new FileReader("C:/Users/Antonio GS/Documents/Prueba práctica 8/alumnos.txt");

//lectura linea por linea 

BufferedReader bufferedUno = new BufferedReader(flujoTxt);

String linea = "";

// sin comillas no reconoce que es un String, lo trataría como un int 



FileOutputStream fileObject = new FileOutputStream("alumnos2.dat");

ObjectOutputStream objectOut = new ObjectOutputStream(fileObject);

while ((linea = bufferedUno.readLine()) != null) {
    String id = "";

 
 
    //para los demás apartados es igual
    for (int i = 0; i < 4; i++) {
        id= id+ linea.charAt(i);
    }

//Constructor mal, hay que arreglarlo
Alumnos alumno = new Alumnos(id);


objectOut.writeObject(alumno);
}

objectOut.close();
fileObject.close();
bufferedUno.close();


    }
}
