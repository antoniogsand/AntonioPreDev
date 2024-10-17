import java.util.Scanner;
public class Arrays_Dos {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("indica que tamaño va a tener el array");
        int tamanio = sc.nextInt();
        int [] numeros = new int [tamanio];

        // carga dinámica

        for(int i= 0; i<numeros.length; i++){
            System.out.println("Pon un número");
            int num = sc.nextInt();
            /*si num no se guarda en algún lado se vuelve a escribir en cada vuelta */
            numeros[i]=num;
        }
        for(int i = 0; i<numeros.length; i++){
            /*Esa i de números lo que mostrará es el valor que vaya teniendo que será la posición del array
             * por ejemplo si la i empieza en 0 muestra la posición 0 
             * si es empieza en 4 la posición 4 */
            int mostrarArray = numeros[i];
            System.out.println(mostrarArray);
        }

    }
}
