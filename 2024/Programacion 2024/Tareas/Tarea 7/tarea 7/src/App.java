import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // Prueba para ver si funciona la función validarDNI
    System.out.println(" prueba validar "+validarDNI("54846451A"));

    //Objeto con constructor por parámetros 
    Persona p1 = new Persona(678063461, "Antonio@hotmail.com", "21/07/1917", "12345678P");
    
    //
    System.out.println(p1);
    
    }

     public static boolean validarDNI(String dni) {
        // Expresión regular para validar el formato del DNI
        String expresionRegular = "\\d{8}[A-Z]";
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(dni);
        return matcher.matches();
    }

}