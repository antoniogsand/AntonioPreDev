import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Introduce un número para ver su factorial");
        int numero= sc.nextInt();
        // si inicio factorial en cero daría 0 ya que multiplicaría por cero constantemente
        int factorial= 1;
        
        for (int i=0; i<numero; numero--){
            factorial= factorial*numero;
            }
        System.out.println("El factorial del número introducido es " + factorial);
    }




    
}
