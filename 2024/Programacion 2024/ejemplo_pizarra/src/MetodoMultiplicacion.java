import java.util.Scanner;

public class MetodoMultiplicacion {
    public static void main(String[] args) throws Exception{
        
        //método multiplicación de tres números
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Primer número a multiplicar");
        int numeroUno = sc.nextInt();

        System.out.println("Segundo número a multiplicar ");
        int numeroDos = sc.nextInt();

        System.out.println("Introduce el tercer número a multiplicar");
        int numeroTres = sc.nextInt();
        int resultadoMultiplicacion = multiplicacion(numeroUno, numeroDos, numeroTres);

        System.out.println("El resultado es " + resultadoMultiplicacion);

    }

    public static int multiplicacion (int x, int y, int z){
        return x*y*z;
    }
}
