import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        /*
         * int[] array1 = {1, 2, 3};
         * ArrayList<int[]> listaDeArrays = new ArrayList<int[]>();
         * listaDeArrays.add(array1);
         */

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        ArrayList<int[]> listaDeArrays = new ArrayList<int[]>();
        listaDeArrays.add(array1);
        listaDeArrays.add(array2);

        // Recorrer el ArrayList
        for (int i = 0; i < listaDeArrays.size(); i++) {
            /* hay que acceder a cada elemento del arraylist. Este tiene dos elementos el array1 y el array2
             * con paréntesis al elemento
             * necesito la variable array de abajo porque es la que almacena el elemento del arraylist
             */
            int[] array = listaDeArrays.get(i);
            for (int j = 0; j < array.length; j++) { // Bucle anidado para recorrer cada array
                // con corchetes a los valores del array que se recore
                System.out.println(array[j]);
            }
        }

    }

}
