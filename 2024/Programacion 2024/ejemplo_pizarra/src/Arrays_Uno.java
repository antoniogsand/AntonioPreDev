import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Uno {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon el tamaño que quieres que tenga el array");
       // int tamanio = sc.nextInt();
        // un array con tamaño dinámico pero vacio
        // si tengo asignados valores al decirle el tamaño no puede ser inferior al número de valores asignados
        int [] numeros =  {6,55,2,87,4};
        // a cada posición le doy un valor de forma estática con la variable tamanio

        int media=0;


        numeros[0] = 6;
        numeros[1] = 55;
        numeros[2] = 2;
        numeros[3] = 87;
        numeros[4] = 4;
        // muestro esos valores pero convertidos en String
        
        
        for (int i = 0; i<5; i= i+2){
            media= media+ numeros[i];
        }
        System.out.println(media);
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros[3]);
        


        
        }



    }

