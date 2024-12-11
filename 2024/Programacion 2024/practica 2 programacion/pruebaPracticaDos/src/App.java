import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int cuota = 10;

        System.out.println("¿Cuantos en cuantos plazos quieres pagar tu compra?");
        int plazos= sc.nextInt();

        for (int i = 0; i<plazos; i++){
            cuota= cuota*2;
        }

    System.out.println("El total a pagar es "+ (cuota -10));






    }
}
