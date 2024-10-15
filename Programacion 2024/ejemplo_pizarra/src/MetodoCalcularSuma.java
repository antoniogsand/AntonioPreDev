import java.util.Scanner;

public class MetodoCalcularSuma {
    public static void main(String[] args) throws Exception {
        //Metodo básico para calcular una suma
        //declaración de variables

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");    
    int num1 = sc.nextInt();
    
    System.out.println("Introduce otro número");
    int num2 = sc.nextInt();

// Llamada a la función
int resultadoSuma = calcularSuma(num1, num2);

System.out.println("El resultado de la suma es " + resultadoSuma);
sc.close();
}

/*Primero se crea el método fuera del Main */

public static int calcularSuma (int x,int y){
   return x+y;
}

}
