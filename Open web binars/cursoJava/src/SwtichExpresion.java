import java.util.Scanner;

public class SwtichExpresion {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Error: El número introducido no es válido";
        };

        System.out.println("El día correspondiente es: " + diaSemana);
        scanner.close();
    }
    }
