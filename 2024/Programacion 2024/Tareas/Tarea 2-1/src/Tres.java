import java.util.Scanner;

public class Tres {
    public static void main(String[] args) throws Exception {
     //Calcular la media aritmética de 3 números cualquiera que se pidan al usuario.    

    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce el primer número");
    double primerNumero = sc.nextDouble(); 
    System.out.println("Introduce el segundo número");
    double segundoNumero = sc.nextDouble(); 
    System.out.println("Introduce el tercer número");
    double tercerNumero = sc.nextDouble(); 

    System.out.println("La media aritmética de los tres números introducidos es " + (primerNumero + segundoNumero + tercerNumero) / 3);
    sc.close();
}
}
