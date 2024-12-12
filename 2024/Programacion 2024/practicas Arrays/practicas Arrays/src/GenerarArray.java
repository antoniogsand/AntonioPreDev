import java.util.Scanner;

public class GenerarArray {
    /* Una de las diferencias entre esta función y la del otro archivo es que aquí le indico que tamaño va a tener el array al usarla
     * y en la función del otro archivo se lo indico al generarla
     */
    public static void main(String[] args) {
        int[] miArreglo = generarArray(5); // Creamos un arreglo de tamaño 5
        
        // Imprimimos los elementos del arreglo
        for (int i= 0; i< miArreglo.length; i++) {
            System.out.println(miArreglo[i]);
        }
    }



    public static int[] generarArray(int tamañoArray) {
        int[] array = new int[tamañoArray]; // Creamos un arreglo con el tamaño especificado
        Scanner sc = new Scanner (System.in);
        // Llenamos el arreglo con valores, por ejemplo, del 1 al tamaño
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Introduce tantos valores como indique el tamaño del array");
            array[i] = sc.nextInt();
        }

        return array;
    }
}
