import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Uno {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon el tamaño que quieres que tenga el array");
        int tamanio = sc.nextInt();
        // un array con tamaño dinámico pero vacio
        // si tengo asignados valores al decirle el tamaño no puede ser inferior al número de valores asignados
        int [] numeros = new int [tamanio];
        // a cada posición le doy un valor de forma estática
        numeros[0] = 6;
        numeros[1] = 55;
        numeros[2] = 2;
        numeros[3] = 87;
        numeros[4] = 4;
        // muestro esos valores pero convertidos en String
        System.out.println(Arrays.toString(numeros));


        
        }



    }

