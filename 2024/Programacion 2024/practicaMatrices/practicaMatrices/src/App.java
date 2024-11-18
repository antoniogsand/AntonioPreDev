import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

    Random aleatorio = new Random();



/*array 6 filas 10 columnas con enteros positivos 
entre 0 y 1000 ambos inluidos y el programa debe de dar la posicion del maximo y del minimo */

int matriz [][]= new int[6][10];
// rellenar matriz
for (int filas = 0; filas<matriz.length; filas ++){
    for(int columnas= 0; columnas<matriz[filas].length; columnas++){
        int numeroAleatorio = aleatorio.nextInt(1001);
        matriz[filas][columnas]= numeroAleatorio;
    }
}

//visualizar matriz
for (int filas = 0; filas<matriz.length; filas ++){
    for(int columnas= 0; columnas<matriz[filas].length; columnas++){
        int numeroAleatorio = aleatorio.nextInt(1001);
        System.out.print("-");
        System.out.print(matriz[filas][columnas]= numeroAleatorio);
    }
    System.out.println();
}

// posicion del maximo y del minimo

/*debería de ser algo así: me devuelve la matriz rellena de números aleatorios (o consecutivos)
 * y debería de comparar desde el primer valor hasta el último e ir diciendole que si el primer valor es mayor al segundo que me muestre el primero,
 * si el primero que es el que está guardado es menos al tercero que me muestre el tercero y que lo guarde
 * que si el tercero es mayor al cuarto que siga mostrando el tercero... y así todo el rato y al final mostrar la posición
 * del tercero por ejemplo
 * con el valor mínimo igual
 */








    }
}
