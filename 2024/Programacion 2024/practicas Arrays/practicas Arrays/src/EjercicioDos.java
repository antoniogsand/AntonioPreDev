public class EjercicioDos {
    

public static void main(String[] args) {
    
 // Ejemplo de array con números
int[] numeros = {12321, 45654, 78987, 12345, 101, 202, 54345};

 // Llamada a la función para encontrar los números capicúas
int[] capicuas = encontrarCapicuas(numeros);

 // Imprimir los números capicúas encontrados
System.out.println("Números capicúas:");
for (int num : capicuas) {
    System.out.println(num);
}


}



// Función que devuelve un array con los números capicúas
/* el array para encontrarlos está creado en el main
 * a la función le entra como un parámetro
 */
public static int[] encontrarCapicuas(int[] array) {
    // Contar cuántos números son capicúas para saber de que tamaño se debe de crear
    /* en base al array creado en el main */
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

// Función que determina si un número es capicúa
public static boolean esCapicua(int numero) {
    String original = String.valueOf(numero); // Convertir el número a cadena
    String invertido = new StringBuilder(original).reverse().toString(); // Invertir la cadena
    return original.equals(invertido); // Comparar la cadena original con la invertida
}
}




