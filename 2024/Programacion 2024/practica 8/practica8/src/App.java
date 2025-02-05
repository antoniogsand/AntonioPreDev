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

linea = bufferedUno.readLine();

FileOutputStream fileObject = new FileOutputStream("C:/Users/Antonio GS/Documents/Prueba práctica 8/alumnos2.dat");

ObjectOutputStream objectOut = new ObjectOutputStream(fileObject);

while ((linea = bufferedUno.readLine()) != null) {
String id = linea.charAt(0) + "" + linea.charAt(1);
String nombre1 = linea.charAt(4) + "" + linea.charAt(5) + linea.charAt(6) + linea.charAt(7) + linea.charAt(8) + linea.charAt(9) + linea.charAt(10) + linea.charAt(11) + linea.charAt(12) + linea.charAt(13) + linea.charAt(14) + linea.charAt(15);
String nombre2 = linea.charAt(16) + "" + linea.charAt(17) + linea.charAt(18) + linea.charAt(19) + linea.charAt(20) + linea.charAt(21) + linea.charAt(22) + linea.charAt(23) + linea.charAt(23) + linea.charAt(25) + linea.charAt(26) + linea.charAt(27) + linea.charAt(28) +linea.charAt(29);
String apellido1= linea.charAt(30) + "" + linea.charAt(31) + linea.charAt(32) + linea.charAt(33) + linea.charAt(34) + linea.charAt(35) + linea.charAt(36) + linea.charAt(37) + linea.charAt(38) + linea.charAt(39) + linea.charAt(40) + linea.charAt(41) + linea.charAt(42) + linea.charAt(43) + linea.charAt(44) + linea.charAt(45);
String apellido2= linea.charAt(46) + "" + linea.charAt(47) + linea.charAt(48) + linea.charAt(49) + linea.charAt(50) + linea.charAt(51) + linea.charAt(52) + linea.charAt(53) + linea.charAt(54) + linea.charAt(55) + linea.charAt(56) + linea.charAt(57) + linea.charAt(58) + linea.charAt(59); 
String email=  linea.charAt(60) + "" + linea.charAt(61) + linea.charAt(62) + linea.charAt(63) + linea.charAt(64) + linea.charAt(65) + linea.charAt(66) + linea.charAt(67) + linea.charAt(68) + linea.charAt(69) + linea.charAt(70) + linea.charAt(71) + linea.charAt(72) + linea.charAt(73) + linea.charAt(74) + linea.charAt(75) + linea.charAt(76) + linea.charAt(77) + linea.charAt(78) + linea.charAt(79) + linea.charAt(80) + linea.charAt(81) + linea.charAt(82) + linea.charAt(83) + linea.charAt(84) + linea.charAt(85) + linea.charAt(86) + linea.charAt(87) + linea.charAt(88) + linea.charAt(89) + linea.charAt(90) + linea.charAt(91);
String telefono = linea.charAt(92)+ "" + linea.charAt(93) + linea.charAt(94) + linea.charAt(95) + linea.charAt(96) + linea.charAt(97) + linea.charAt(98) + linea.charAt(99) + linea.charAt(100) + linea.charAt(101) + linea.charAt(102) + linea.charAt(103);

Alumnos alumno = new Alumnos(id, nombre1, nombre2, apellido1, apellido2, email, telefono);
objectOut.writeObject(alumno);
}

objectOut.close();
fileObject.close();
bufferedUno.close();


/* 
FileInputStream rutaLectura = new FileInputStream("alumnos.dat");

FileOutputStream fichero = null;
DataOutputStream flujoDeSalida= null;


    fichero = new FileOutputStream("prueba.dat");
    flujoDeSalida= new DataOutputStream(rutaLectura);
    for (int i = 65; i<=90; i++){
        flujoDeSalida.writeChar(i);

        FileInputStream archivoLectura = new FileInputStream("C:/Users/anton/Pictures/imagen.jpg");

        int contador=0;
        
        int c = archivoLectura.read();
        
        
                while (c != -1) {
                System.out.println(c);
                c= archivoLectura.read();
                contador ++;
                System.out.println(contador);
            }
            archivoLectura.close();
*/

    }
}
