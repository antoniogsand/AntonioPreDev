import java.util.Scanner;

public class EjercicioNotaLiteral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota de forma numérica del 1 al 10");
        int notaNumerica= sc.nextInt();

        String notaLiteral= switch (notaNumerica){

            case 1-> "Insuficiente";
            case 2-> "Insuficiente";
            case 3-> "Insuficiente";
            case 4-> "Insuficiente";
            case 5-> "Suficiente";
            case 6-> "Bien";
            case 7-> "Notable";
            case 8-> "Notable";
            case 9-> "Sobresaliente";
            case 10-> "Sobresaliente";
            default -> "Introduce una nota validad entre 1 y 10";
        };

        System.out.println("La nota introducida de forma numérica se corresponde a un " + notaLiteral + " en formato texto");
    }
}
