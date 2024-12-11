import java.util.Scanner;

public class ComprarProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuanto quieres pagar en la primera cuota");
        int cuota= sc.nextInt();

        int totalPagar= cuota;

        System.out.println("Introduce el número de plazos");
        int numeroPlazos= sc.nextInt();

        for(int i =0; i<numeroPlazos; i++){
            totalPagar= totalPagar*2;
        }
        System.out.println(totalPagar-10);







    }
}
