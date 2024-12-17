import java.util.Scanner;

public class GenerarArrayDos {
    
    public static void main(String[] args) {
        int[] miArray = crearArray();
        
        // Imprimir los elementos del array
        for (int i=0; i<miArray.length; i++){
            System.out.println(miArray[i]);
        }
    }




/* primero hay que declarar de que tipo de dato es la función, su nombre y si recibe algo o no */
    public static int[] crearArray() {
// Aquí va toda la lógica
            Scanner scanner = new Scanner(System.in);

            int[] array = new int[4];
            // int [] array = {3,73,6,33,77} así tendría ya unos valores definidos y no habría que introducírselos más abajo
    
           // también puedo ir agregándole valores posición a posición array [0]= 3;
            System.out.println("introduce los valores del array según su tamaño ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
    
            return array;
        }

    


}
