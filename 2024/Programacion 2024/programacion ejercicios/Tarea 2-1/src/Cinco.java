import java.util.Scanner;
public class Cinco {
    public static void main(String[] args) throws Exception{
    /*Calcular la cantidad de segundos según los días, las horas, minutos y segundos que introduzca el usuario.
(Utiliza constantes para almacenar valores que no cambiarían a lo largo del programa)*/
    Scanner sc = new Scanner(System.in);

    final int segundosHora = 3600;
    final int segundosMinuto = 60;

    System.out.println("Introduce las horas");
    int horas = sc.nextInt();

    System.out.println("Introduce los minutos");
    int minutos = sc.nextInt();

    System.out.println("Introduce los segundos");
    int seg = sc.nextInt();

    System.out.println("El total de segundos de las horas introducidas es " + segundosHora * horas + " el número de segundos en los minutos introducidos es " + segundosMinuto * minutos + " el múmero de segundos es " + seg);
    sc.close();
}
}
