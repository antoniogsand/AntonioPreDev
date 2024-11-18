import java.util.Scanner;
public class Seis {
    public static void main(String[] args) throws Exception{
        /*Implementa un programa que pida al usuario una cantidad en grados centígrados
        y la pase a grados Fahrenheit. La fórmula para pasar de grados centígrados a Fahrenheit es: F = 32 + (9 * C / 5). */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los grados centígrados que quieras pasar a fahrenheit");
        double gradosCent = sc.nextDouble();

        double gradosF = 32 + (9 * gradosCent / 5);


        System.out.println("Los grados centigrados introducidos son " + gradosF + " grados Fahrenheit");
        sc.close();
    }
}
