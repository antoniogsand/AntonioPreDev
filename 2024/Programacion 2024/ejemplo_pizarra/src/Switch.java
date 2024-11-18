import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception{

        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la opción que quieres elegir del menú ");
        int opcion = sc.nextInt();
        System.out.println("Introduce el primer número");
        int num1= sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2= sc.nextInt();
        int resultado = 0;
        switch (opcion){

            case 0: 
            
                calcularSuma(num1, num2);
                resultado = calcularSuma(num1, num2);
                System.out.println("El resultado de la suma es " + resultado);
                break;

            case 1:

                resultado = calcularResta(num1, num2);
                System.out.println("El resultado de la resta es " + resultado);
                break;
        }
    
    }

    public static int calcularSuma (int x,int y){
        return x+y;
     }

     public static int calcularResta (int x, int y){
        return x-y;
     }

}
