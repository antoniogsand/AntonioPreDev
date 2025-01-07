import java.util.Scanner;

public class SwitchSentencia {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String diaSemana = "";

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Error: El número introducido no es válido";
                break;
        }

        System.out.println("El día correspondiente es: " + diaSemana);
        scanner.close();
    }
    }
