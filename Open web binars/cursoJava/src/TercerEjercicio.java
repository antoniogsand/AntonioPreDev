import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        
        /* Escribir un programa que, dada una cantidad de euros, nos indique cuál es su valor en dólares americanos.
        Además de la variable para la cantidad de euros, se debe declarar otra para el cambio
        (el valor de un dólar en euros) y para el resultado final. Muestra el resultado por consola. */

        Scanner sc = new Scanner (System.in);

        double ValorDolar= 1.05;
        
        System.out.println("Introduce la cantidad en euros");
        var cantidadEuros= sc.nextInt();

        var conversion= cantidadEuros/ValorDolar;

        System.out.println("El valor en dolares de la cantidad en euros que has introducido es " + conversion);
    }
}
