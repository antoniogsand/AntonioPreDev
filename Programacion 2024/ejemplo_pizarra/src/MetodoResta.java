import java.util.Scanner;

public class MetodoResta {
    public static void main(String[] args) throws Exception{

Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer número");
        int primerNumero = sc.nextInt();

        System.out.println("Introduce el segundo número");
        int segundoNumero = sc.nextInt();
    
    int resta = restarNumero(primerNumero, segundoNumero);

    System.out.println("El resultado de la resta es " + resta);
    
    }



    public static int restarNumero (int x, int y){
        return x-y;
    }
}
