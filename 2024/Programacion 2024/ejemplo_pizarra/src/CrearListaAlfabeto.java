import java.util.ArrayList;
import java.util.LinkedList;

public class CrearListaAlfabeto {
    public static void main(String[] args) {
    

      /*   char [] letrasALfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
         
        
        LinkedList <Character> alfabeto = new LinkedList<Character>();

        
        for (int i =0; i<letrasALfabeto.length; i++){
        alfabeto.add(letrasALfabeto[i]);
        }

        System.out.println(alfabeto);

        */

        
        /* FALLO no se puede añadir un entero a un array de caracteres, primero hay que convertirlo con un casting a char */
        ArrayList <Character> alfabeto = new ArrayList<Character>();

        for(int i= 65; i<=90; i++){
            alfabeto.add((char) i);
        }
        System.out.println(alfabeto);




    }
}
