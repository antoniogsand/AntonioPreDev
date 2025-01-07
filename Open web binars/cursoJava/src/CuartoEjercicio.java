import java.util.Scanner;

public class CuartoEjercicio {
    public static void main(String[] args) {
        /* Escribe un programa que determine si un número es par o impar usando el operador ternario */
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce un numero para saber si es par o impar");
    int numero= sc.nextInt();
    /* En el operador ternario se evalua un true o un false introduciendo la condición a evaluar entre paréntesis seguida del signo ?
     */
    String comprobarParImpar = (numero % 2 == 0) ? "El número es par" : "El número es impar";
    System.out.println(comprobarParImpar); // Imprime si el número es par o impar"


    
    
    }
}
