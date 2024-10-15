import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int dado1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número");
        int dado2 = sc.nextInt();

        System.out.println("introduce el tercer número");
        int dado3 = sc.nextInt();
/* es necesario ver en cada variable si cumple la condición */
    if(dado1!=6 && dado2!=6 && dado3 != 6){
        System.out.println("El resultado es pesimo");
    }
    else if (dado1 || dado2 == 6){
        System.out.println("El resultado es regular");
    }
    else if (dado1 && dado2 ){}
    }
}
