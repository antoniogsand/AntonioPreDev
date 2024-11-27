import java.util.ArrayList;
import java.util.Random;

public class Dni {
    private String dni;


    public Dni (){
        this.dni= "";
    }

    public Dni (String dni){
        this.dni= dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public String generarDni (){
        Random random = new Random();
        StringBuilder cadena = new StringBuilder();

        // Generar 8 dígitos aleatorios con un for
        // el método append va agregando  un nuevo valor al final de la cadena existente mientras se va ejecuentando el bucle
        /*  entre paréntesis se le indica el rango de números a usar para generar el número aleatorio
            en este caso lo formaría con el 0, 1, 2, 3 y el 4, el 5 lo excluye*/
            cadena.append(random.nextInt(5));
        for (int i = 1; i < 8; i++) {
            cadena.append(random.nextInt(10));
        }

        /*  Generar una letra mayúscula aleatoria de la tabla ascii entre el 65 que es la A hasta el 90 que es la Z
         *  como quiero que me devuelva un char le hago un casting al entero que me genera
         *  le digo que me lo agrege al final del objeto de la clase StringBuilder que se genera
        */
        char letraMayuscula = (char) (random.nextInt(26) + 65);
        cadena.append(letraMayuscula);
                return cadena.toString();
    }

    public boolean validarDni (){
        if(dni.length() ==9 && dni.charAt(8)== 'T' || dni.charAt(8)== 'R' || dni.charAt(8)== 'W' || dni.charAt(8)== 'A' || dni.charAt(8)== 'G' || dni.charAt(8)== 'M' || dni.charAt(8)== 'Y' || dni.charAt(8)== 'F' || dni.charAt(8)== 'P' || dni.charAt(8)== 'D' || dni.charAt(8)== 'X' || dni.charAt(8)== 'B' || dni.charAt(8)== 'N' || dni.charAt(8)== 'J' || dni.charAt(8)== 'Z' || dni.charAt(8)== 'S' || dni.charAt(8)== 'Q' || dni.charAt(8)== 'V' || dni.charAt(8)== 'H' || dni.charAt(8)== 'L' || dni.charAt(8)== 'C' || dni.charAt(8)== 'K' || dni.charAt(8)== 'E'){
        return true;
        }return false;
    }

    @Override
    public String toString() {
        return "Dni [dni=" + dni + " ]";
    }
    










}
