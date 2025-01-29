import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionEjemplo {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer num : numeros) {
            System.out.println(num);
        }

        HashMap <Integer,String> palabras = new HashMap<Integer,String>();

        palabras.put (1,"teclado");
        palabras.put (2,"raton");
        palabras.put (3,"pantalla");

        for (Integer clave : palabras.keySet()) {
            System.out.println(clave);
            System.out.println(palabras.get(clave));
        }
    }
}
