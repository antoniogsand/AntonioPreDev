import java.util.Scanner;

public class Dos {
    public static void main(String[] args) throws Exception {
//Pedir 1 número y devolver su valor cambiado de signo.   
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce el primer número");
    int numeroUno = sc.nextInt();
    System.out.println("El numero introducido es el siguiente " + numeroUno + " pero con el signo cambiado pasa a ser este otro " + numeroUno * -1);
    sc.close();
    }

}
