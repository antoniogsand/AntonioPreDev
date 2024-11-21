import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      
      Dni dPrueba= new Dni();
      System.out.println(dPrueba.generarDni());
      
      for (int i= 0; i<10; i++){
        System.out.println(dPrueba.generarDni());
      }
      
      
      
        /* 
        Persona p1 = new Persona("Antonio", "García");
        Dni d1 = new Dni("45740671T");
        System.out.println(d1.validarDni());

      */
 /* 
String cadenaAleatoria = generarCadenaAleatoria();
        System.out.println(cadenaAleatoria);
    
    
    }
    
  private static String generarCadenaAleatoria() {
        Random random = new Random();
        StringBuilder cadena = new StringBuilder();

        // Generar 8 dígitos aleatorios
        for (int i = 0; i < 8; i++) {
            cadena.append(random.nextInt(10));
        }

        // Generar una letra mayúscula aleatoria
        char letraMayuscula = (char) (random.nextInt(26) + 'A');
        cadena.append(letraMayuscula);

        return cadena.toString();
 */
    }
}
