import java.util.Scanner;

public class Uno {
    public static void main(String[] args) throws Exception {
    
    // Pedir 2 números al usuario y sumarlos, restarlos, multiplicarlos y dividirlos.
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce el primer número");
    int numeroUno = sc.nextInt();
    
    System.out.println("Introduce el segundo número");
    int numeroDos = sc.nextInt();

    System.out.println("La suma del primer y el segundo número es " + (numeroUno + numeroDos));

    System.out.println("La resta del primer y el segundo número es " + (numeroUno - numeroDos));

    System.out.println("La multiplicación del primer y el segundo número es " + (numeroUno * numeroDos));

    System.out.println("La división del primer y el segundo número es " + (numeroUno / numeroDos));
    sc.close();
    }
}
