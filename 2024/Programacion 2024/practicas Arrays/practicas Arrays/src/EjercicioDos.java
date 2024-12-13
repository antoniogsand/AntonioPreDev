public class EjercicioDos {
    

public static void main(String[] args) {
    
 // Ejemplo de array con números
int[] numeros = {12321, 45654, 78987, 12345, 101, 202, 54345};

 // Llamada a la función para encontrar los números capicúas
int[] capicuas = encontrarCapicuas(numeros);

 // Imprimir los números capicúas encontrados
System.out.println("Números capicúas:");
for (int i= 0; i<capicuas.length; i++) {
    System.out.println(capicuas[i]);
}

}



// Función que devuelve un array con los números capicúas
/* el array para encontrarlos está creado en el main
 * a la función le entra como un parámetro
 */
public static int[] encontrarCapicuas(int[] array) {
    // Contar cuántos números son capicúas del array creado en el main 
    // para saber de que tamaño se debe de crear el array que los contendra
    // antes de eso hay que crear una función para saber si un número es capicua o no
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (esCapicua(array[i])) {
            count++;
        }
    }

    // Crear un array del tamaño adecuado para los números capicúas
    int[] resultado = new int[count];
    int index = 0;

    // Llenar el array 'resultado' con los números capicúas
    for (int i = 0; i < array.length; i++) {
        if (esCapicua(array[i])) {
            resultado[index] = array[i];
            index++;
        }
    }

    return resultado;
}
// esto es lo primero, si no se sabe si un número es capicua todo lo demás no sirve
// Función que determina si un número es capicúa
public static boolean esCapicua(int numero) {
    String original = String.valueOf(numero); // Convertir el número a cadena
    String invertido = new StringBuilder(original).reverse().toString(); // Invertir la cadena
    return original.equals(invertido); // Comparar la cadena original con la invertida
}
}




