import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     /* 

        int numero1 = 6, numero2 = 3;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        double division = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division);
        System.out.println(resto);

        */
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numeroUno = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numeroDos = sc.nextInt();
       System.out.println("Introduce el tercer número");
        int numeroTres = sc.nextInt();
        System.out.println("introduce el primer numero");

        if (numeroUno < numeroDos && numeroUno < numeroTres) {
            System.out.println("Los números están ordenados2");
        }
        else{
            System.out.println("Los números no están ordenados");
        }

    /* 
        int numeroUnoo = 6;

        if(numeroUnoo % 2 == 0){
            System.out.println("El número es par");
        } */
    }
}
