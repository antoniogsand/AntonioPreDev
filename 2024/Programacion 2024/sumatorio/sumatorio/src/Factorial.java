import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        int numero= sc.nextInt();
        
        int factorial= 1;
        
        for (int i=0; i<numero; numero--){
            factorial= factorial*numero;

        }

        System.out.println(factorial);
    }




    
}
