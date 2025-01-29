import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
/* MENÚ OPCIONES

1 - CIFRADO 

Pedir frase al usuario | Pedir Clave Numérica | Crear fichero de texto "cifrado.txt" |
Cifrar frase con ayuda de la clave y escribir la frase cifrada en el fichero de texto nombrado anteriormente

2 - DESCIFRADO

Pedir clave Numérica |  Mostrar por pantalla el fichero de texto "cifrado.txt" | Mostrar por pantalla el fichero descifrado

3 - SALIR

** TIPO DE CIFRADO

abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; (quitamos la Ñ para solucionar problemas
y utilizamos solamente las mayúsculas, convertir a mayúscula cada uno de los caracteres de la frase)

Recorreremos carácter a carácter la frase introducida por el usuario.
Si el carácter existe en el abecedario, avanzamos x posiciones indicadas por la clave introducida, por ejemplo 5) en el abecedario.
Para las últimas posiciones (por ejemplo, X + 5 => C), lo recomendable sería utilizar el operador módulo.
Si no existe en el abecedario, dejaremos el carácter tal cual. 

*/


Scanner sc= new Scanner (System.in);
int numeroOpciones;

char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

FileWriter fw = new FileWriter("cifrado.txt");

// tengo el valor de la frase introducida por el usuario en un String
String letra = "";

do{
    
    System.out.println("Hola, introduce una frase");
    String fraseUsuario = sc.nextLine();
    
    String [] array= {fraseUsuario};

    System.out.println("Continua introduciendo una clave numérica");
    int claveUsuario= sc.nextInt();
    


    System.out.println("Si quieres cifrar la frase introducida pulsa 1");
    System.out.println("si quieres descifrar la frase introducida pulsa 2");
    System.out.println("si quieres salir del programa pulsa 3");

    numeroOpciones = sc.nextInt();
    switch (numeroOpciones) {

        case 1:
            for (int i =0; i<array.length; i++){
            
        
            letra = array [i];
            
            }


            break;
        case 2:

            break;
        case 3:
        
            break; 
        default:
        System.out.println("La opción que has elegido no es válida");
    }


} while (numeroOpciones != 0);

System.out.println("La frase es" + letra);


    }
    
}
