import java.util.Scanner;

public class LimitesIntervalos {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    
    
    int numero= 1;
    
    System.out.println("Introduce el limite inferior");
    int limiteInferior= sc.nextInt();
    
    System.out.println("Introduce el limite superior");
    int limiteSuperior= sc.nextInt();
    int numeroIntervalo= 0;
    int fueraIntervalo= 0;
    
    while (numero!= 0) {
        
    numero= sc.nextInt();
    
        if (numero >limiteInferior && numero<limiteSuperior){
            numeroIntervalo++;
        }else{
            fueraIntervalo++;
        }
    }
    System.out.println(numeroIntervalo);
    System.out.println(fueraIntervalo);
}




}




    
