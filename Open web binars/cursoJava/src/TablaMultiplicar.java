import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce un número para mostrar su tabla de multiplicar");
        int numero= sc.nextInt();
        
        
        for(int i = 1; i<=10; i++){
            System.out.println(numero*i);
        }
    }
}
