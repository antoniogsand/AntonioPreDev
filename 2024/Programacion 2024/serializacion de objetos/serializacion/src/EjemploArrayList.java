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
            int[] array = listaDeArrays.get(i);
            System.out.println(array [i]);
            // Recorrer el array dentro del ArrayList
            //for (int j = 0; j < array.length; j++) {
              //  System.out.println(array[j]);
           // }
        }

    }

}
