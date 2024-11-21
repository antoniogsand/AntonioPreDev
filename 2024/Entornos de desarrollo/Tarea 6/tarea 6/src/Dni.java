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

        // Generar 8 dígitos aleatorios
        for (int i = 0; i < 8; i++) {
            cadena.append(random.nextInt(10));
        }

        // Generar una letra mayúscula aleatoria
        char letraMayuscula = (char) (random.nextInt(26) + 'A');
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
